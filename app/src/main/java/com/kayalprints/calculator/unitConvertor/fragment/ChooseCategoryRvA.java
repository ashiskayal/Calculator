package com.kayalprints.calculator.unitConvertor.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.kayalprints.calculator.R;
import com.kayalprints.calculator.databinding.ListItemBinding;

import java.util.List;

public class ChooseCategoryRvA extends RecyclerView.Adapter<ChooseCategoryRvA.CategoryViewHolder> {

    private final List<String> categoryList;
    private OnCategoryClickListener listener;

    public ChooseCategoryRvA(@NonNull List<String> categories) {
        this.categoryList = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding bind = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.list_item, parent, false);
        return new CategoryViewHolder(bind);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.binding.setData(categoryList.get(position));
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        ListItemBinding binding;

        public CategoryViewHolder(ListItemBinding bind) {
            super(bind.getRoot());
            this.binding = bind;

            itemView.setOnClickListener(v -> {
                int pos = getAdapterPosition();
                if (listener != null && pos != RecyclerView.NO_POSITION)
                    listener.onCategoryClick(categoryList.get(pos));
            });
        }
    }

    public interface OnCategoryClickListener {
        void onCategoryClick(String category);
    }

    public void setOnCategoryClickListener(OnCategoryClickListener listener) {
        this.listener = listener;
    }
}
