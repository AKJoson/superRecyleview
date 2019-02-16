package com.superrecyleview.xcy.viewModel;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.superrecyleview.xcy.R;

public class ViewModel extends BaseViewModel {
    public RecyclerView.Adapter adapter;
    public RecyclerView.ItemDecoration itemDecoration;
    public RecyclerView.LayoutManager layoutManager;

    public ViewModel(AppCompatActivity activity) {
        super(activity);
        adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                return new MyViewHolder(LayoutInflater.from(mActivity).inflate(R.layout.item_layout,viewGroup,false));
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int postion) {
                ((MyViewHolder)viewHolder).textView.setText("hello:"+postion);
            }

            @Override
            public int getItemCount() {
                return 100;
            }
             class MyViewHolder extends RecyclerView.ViewHolder{
                 TextView textView;
                 public MyViewHolder(@NonNull View itemView) {
                     super(itemView);
                     textView = itemView.findViewById(R.id.item_name);
                 }
             }
        };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mActivity);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager = linearLayoutManager;
    }


}
