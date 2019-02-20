package com.superrecyleview.xcy.viewModel;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.superrecyleview.xcy.R;
import com.superrecyleview.xcy.base.BaseAdapter;
import com.superrecyleview.xcy.base.MyViewHolder;
import com.superrecyleview.xcy.BR;

import java.util.ArrayList;
import java.util.List;

public class ViewModel extends BaseViewModel {
    public BaseAdapter<String> adapter;
    public RecyclerView.ItemDecoration itemDecoration;
    public RecyclerView.LayoutManager layoutManager;
    private List<String> lists = new ArrayList<>(10);

    public ViewModel(AppCompatActivity activity) {
        super(activity);

        adapter = new BaseAdapter<String>(lists, R.layout.item_layout) {

            @Override
            public void bindHolder(MyViewHolder viewHolder,String item, int position) {
                viewHolder.getBinding().setVariable(BR.value,item);
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mActivity);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager = linearLayoutManager;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    lists.add(i + "aaa");
                }
                lists.toString();
                adapter.updateData(lists);
            }
        }, 5000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                adapter.deleteData(2);
            }
        }, 10000);

    }


}
