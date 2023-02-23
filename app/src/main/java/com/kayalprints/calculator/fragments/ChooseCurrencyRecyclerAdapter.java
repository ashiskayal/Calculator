package com.kayalprints.calculator.fragments;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.kayalprints.calculator.Currency;
import com.kayalprints.calculator.R;
import com.kayalprints.calculator.databinding.ListItemBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChooseCurrencyRecyclerAdapter extends RecyclerView.Adapter<ChooseCurrencyRecyclerAdapter.CurrencyViewHolder> {

    private final List<Currency> currencyList;
    private OnCurrencyClickListener listener;

    public ChooseCurrencyRecyclerAdapter(@NonNull Map<String, Currency> map) {
        this.currencyList = new ArrayList<>(map.values());
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding bind = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.list_item, parent, false);
        return new CurrencyViewHolder(bind);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        Currency currency = currencyList.get(position);
        holder.binding.setCurrency(currency);
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    class CurrencyViewHolder extends RecyclerView.ViewHolder {
        ListItemBinding binding;

        public CurrencyViewHolder(ListItemBinding bind) {
            super(bind.getRoot());
            this.binding = bind;

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