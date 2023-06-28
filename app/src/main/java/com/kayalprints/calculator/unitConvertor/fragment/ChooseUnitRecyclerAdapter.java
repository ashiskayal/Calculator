package com.kayalprints.calculator.unitConvertor.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.kayalprints.calculator.Unit;
import com.kayalprints.calculator.R;
import com.kayalprints.calculator.databinding.ListItemBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChooseUnitRecyclerAdapter extends RecyclerView.Adapter<ChooseUnitRecyclerAdapter.UnitViewHolder> {

    private List<Unit> unitList;
    private OnUnitClickListener listener;

    public ChooseUnitRecyclerAdapter(@NonNull Map<String, Unit> map) {
        this.unitList = new ArrayList<>(map.values());
    }

    @NonNull
    @Override
    public UnitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding bind = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.list_item, parent, false);
        return new UnitViewHolder(bind);
    }

    @Override
    public void onBindViewHolder(@NonNull UnitViewHolder holder, int position) {
        holder.binding.setData(unitList.get(position));
    }

    @Override
    public int getItemCount() {
        return unitList.size();
    }

    public void setUnitList(List<Unit> unitList) {
        this.unitList = unitList;
    }

    class UnitViewHolder extends RecyclerView.ViewHolder {
        ListItemBinding binding;

        public UnitViewHolder(ListItemBinding bind) {
            super(bind.getRoot());
            this.binding = bind;

            itemView.setOnClickListener(v -> {
                int pos = getAdapterPosition();
                if (listener != null && pos != RecyclerView.NO_POSITION)
                    listener.onUnitClick(unitList.get(pos));
            });
        }
    }

    public interface OnUnitClickListener {
        void onUnitClick(Unit unit);
    }

    public void setOnUnitClickListener(OnUnitClickListener listener) {
        this.listener = listener;
    }
}