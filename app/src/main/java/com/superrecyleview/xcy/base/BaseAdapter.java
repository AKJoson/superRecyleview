package com.superrecyleview.xcy.base;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;


public abstract class BaseAdapter<T> extends RecyclerView.Adapter<MyViewHolder> {
    private List<T> data;
    private int layoutId;

    public BaseAdapter(List<T> data, int layoutId) {
        if (data == null)
            throw new RuntimeException("you must init the data type");
        if (layoutId == 0)
            throw new RuntimeException("please check your sub item layout");
        this.data = data;
        this.layoutId = layoutId;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(layoutId, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int position) {
        bindHolder(viewHolder, position);
    }

    public abstract void bindHolder(MyViewHolder viewHolder, int position);

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addData(List<T> list) {
        this.data = data;
        notifyDataSetChanged();
    }
}
