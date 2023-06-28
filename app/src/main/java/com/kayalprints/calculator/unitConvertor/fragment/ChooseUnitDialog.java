package com.kayalprints.calculator.unitConvertor.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kayalprints.calculator.Unit;
import com.kayalprints.calculator.R;
import com.kayalprints.calculator.unitConvertor.ui.UnitConversionFragment;

import java.util.ArrayList;
import java.util.Map;

public class ChooseUnitDialog extends DialogFragment {

    private Map<String, Unit> unitMap;
    private ChooseUnitRecyclerAdapter adapter;

    public ChooseUnitDialog(Map<String, Unit> map) {
        this.unitMap = map;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_choose_unit_dialog, container);

        RecyclerView rv = v.findViewById(R.id.recyclerViewChooseData);
        adapter = new ChooseUnitRecyclerAdapter(this.unitMap);
        rv.setAdapter(adapter);

        adapter.setOnUnitClickListener(unit -> {
            if(UnitConversionFragment.operation) UnitConversionFragment.setToUnit(unit);
            else UnitConversionFragment.setFromUnit(unit);
            dismiss();
        });
        return v;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setUnitMap(Map<String, Unit> unitMap) {
        this.unitMap = unitMap;
        adapter.setUnitList(new ArrayList<>(unitMap.values()));
        adapter.notifyDataSetChanged();
    }
}
