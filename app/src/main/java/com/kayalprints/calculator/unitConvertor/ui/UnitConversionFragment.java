package com.kayalprints.calculator.unitConvertor.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kayalprints.calculator.Unit;
import com.kayalprints.calculator.UnitConvertorData;
import com.kayalprints.calculator.databinding.FragmentUnitConvertorBinding;
import com.kayalprints.calculator.unitConvertor.fragment.ChooseCategoryDialog;
import com.kayalprints.calculator.unitConvertor.fragment.ChooseUnitDialog;
import com.kayalprints.calculator.unitConvertor.roomDB.UnitDBViewModel;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UnitConversionFragment extends Fragment {

    private FragmentUnitConvertorBinding binding;
//    private Map<String, String> units;
//    private Map<String, Double> unitValue;
    private Map<String, Unit> unitMap;
    private List<String> categories;
    private UnitConversionViewModel unitConversionViewModel;
    private UnitDBViewModel unitDBViewModel;
    private ChooseUnitDialog dialog;

    private static UnitConvertorData unitConvertorData;

    private static Unit fromUnit, toUnit;
    private static String category = "";
    public static boolean operation = false;
    // false when fromUnit choosing, true when toUnit choosing. Used by the ChoosingDialog.

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        unitConversionViewModel =
                new ViewModelProvider(this).get(UnitConversionViewModel.class);

        // Initializing the maps
//        units = new TreeMap<>();
//        unitValue = new TreeMap<>();
        unitMap = new TreeMap<>();

        binding = FragmentUnitConvertorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.unitSwipeLayout.setRefreshing(true);

        unitDBViewModel = new UnitDBViewModel(requireActivity());
        unitDBViewModel.getAllCategories().observe(requireActivity(), strings -> {
            categories = strings;
            binding.unitSwipeLayout.setRefreshing(false);
        });

        binding.textViewCategory.setOnClickListener(v -> {
            ChooseCategoryDialog dialog = new ChooseCategoryDialog(categories);
            dialog.show(getChildFragmentManager(), "ChooseCategoryDialog");
        });

//        if(category.isEmpty()) category = null;
        unitConvertorData = new UnitConvertorData(category);
        binding.setData(unitConvertorData);

        // Click listener to the text views in order to choose currencies
        binding.textViewUnitConvFrom.setOnClickListener(v -> {
            if(category==null || category.isEmpty()) {
                Toast.makeText(requireContext(),"Please choose a category first.",Toast.LENGTH_LONG).show();
                return;
            }
            operation = false;
            loadUnitData();
            dialog = new ChooseUnitDialog(unitMap);
            dialog.show(getChildFragmentManager(), "ChooseUnitDialog");
        });

        binding.textViewUnitConvTo.setOnClickListener(v -> {
            if(category==null || category.isEmpty()) {
                Toast.makeText(requireContext(),"Please choose a category first.",Toast.LENGTH_LONG).show();
                return;
            }
            operation = true;
            loadUnitData();
            dialog = new ChooseUnitDialog(unitMap);
            dialog.show(requireActivity().getSupportFragmentManager(), "ChooseUnitDialog");
        });

        // Operation to do by swap refresh
        binding.unitSwipeLayout.setOnRefreshListener(this::refreshData);

        return root;
    }

    private void refreshData() {
        loadUnitData();
    }

    /* Load the unit Data from the local database */
    private void loadUnitData() {
        if(category == null || category.isEmpty()) {
            Toast.makeText(requireContext(), "Please choose a category.", Toast.LENGTH_LONG).show();
            binding.unitSwipeLayout.setRefreshing(false);
            return;
        }
        unitDBViewModel.getUnitByCategory(category).observe(requireActivity(), allunits -> {
            if (allunits != null) {
                unitMap.clear();
                for (Unit c : allunits) unitMap.put(c.getName(), c);
            } else Toast.makeText(requireContext(), "Units database not found.", Toast.LENGTH_SHORT).show();
            binding.unitSwipeLayout.setRefreshing(false);
            if(dialog != null) dialog.setUnitMap(unitMap); // Updating the data.
        });
    }

    public static void setFromUnit(Unit fromUnit) {
        UnitConversionFragment.fromUnit = fromUnit;
        unitConvertorData.setFromUnit(fromUnit);
    }

    public static void setToUnit(Unit toUnit) {
        UnitConversionFragment.toUnit = toUnit;
        unitConvertorData.setToUnit(toUnit);
    }

    public static void setCategory(String category) {
        UnitConversionFragment.category = category;
        unitConvertorData.setCategory(category);
//        unitConvertorData.setFromUnit(null);
//        unitConvertorData.setToUnit(null);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}