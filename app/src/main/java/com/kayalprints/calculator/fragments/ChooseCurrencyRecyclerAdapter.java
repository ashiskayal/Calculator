package com.kayalprints.calculator.fragments;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.kayalprints.calculator.CurrencyDB.Currency;
import com.kayalprints.calculator.R;
import com.kayalprints.calculator.databinding.ListItemBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChooseCurrencyRecyclerAdapter extends RecyclerView.Adapter<ChooseCurrencyRecyclerAdapter.CurrencyViewHolder> {

    private final List<Currency> currencyList;
    private OnCurrencyClickListener listener;

    public ChooseCurrencyRecyclerAdapter(Map<String, Currency> map) {
        this.currencyList = new ArrayList<>(map.values());
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding contactListItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.list_item, parent, false);

        return new CurrencyViewHolder(contactListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        holder.binding.setCurrency(currencyList.get(position));
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    public class CurrencyViewHolder extends RecyclerView.ViewHolder {

        private final ListItemBinding binding;

        public CurrencyViewHolder(ListItemBinding binding) {
            super(binding.getRoot());

            this.binding = binding;

            itemView.setOnClickListener(v -> {
                int pos = getAdapterPosition();
                if (listener != null && pos != RecyclerView.NO_POSITION)
                    listener.onCurrencyClick(currencyList.get(pos));
            });
        }
    }

    public interface OnCurrencyClickListener {
        void onCurrencyClick(Currency currency);
    }

    public void setOnCurrencyClickListener(OnCurrencyClickListener listener) {
        this.listener = listener;
    }

}
