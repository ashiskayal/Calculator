package com.kayalprints.calculator.ui.unitConversion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kayalprints.calculator.databinding.FragmentUnitConvertorBinding;

public class UnitConversionFragment extends Fragment {

    private FragmentUnitConvertorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UnitConversionViewModel unitConversionViewModel =
                new ViewModelProvider(this).get(UnitConversionViewModel.class);

        binding = FragmentUnitConvertorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        unitConversionViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}