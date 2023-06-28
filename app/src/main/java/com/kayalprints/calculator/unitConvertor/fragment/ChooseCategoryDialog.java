package com.kayalprints.calculator.unitConvertor.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kayalprints.calculator.R;
import com.kayalprints.calculator.unitConvertor.ui.UnitConversionFragment;

import java.util.List;

public class ChooseCategoryDialog extends DialogFragment {

    private final List<String> categories;

    public ChooseCategoryDialog(List<String> categories) {
        this.categories = categories;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_choose_unit_dialog, container);

        RecyclerView rv = v.findViewById(R.id.recyclerViewChooseData);
        ChooseCategoryRvA adapter = new ChooseCategoryRvA(categories);
        rv.setAdapter(adapter);

        adapter.setOnCategoryClickListener(category -> {
            UnitConversionFragment.setCategory(category);
            dismiss();
        });
        return v;
    }
}
