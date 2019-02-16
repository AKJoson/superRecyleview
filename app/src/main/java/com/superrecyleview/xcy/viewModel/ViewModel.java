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
    ;

    public ViewModel(AppCompatActivity activity) {
        super(activity);
//        adapter = new RecyclerView.Adapter() {
//            @NonNull
//            @Override
//            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//                return new MyViewHolder(LayoutInflater.from(mActivity).inflate(R.layout.item_layout,viewGroup,false));
//            }
//
//            @Override
//            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int postion) {
//                ((MyViewHolder)viewHolder).textView.setText("hello:"+postion);
//            }
//
//            @Override
//            public int getItemCount() {
//                return 100;
//            }
//             class MyViewHolder extends RecyclerView.ViewHolder{
//                 TextView textView;
//                 public MyViewHolder(@NonNull View itemView) {
//                     super(itemView);
//                     textView = itemView.findViewById(R.id.item_name);
//                 }
//             }
//        };
        adapter = new BaseAdapter<String>(lists, R.layout.item_layout) {

            @Override
            public void bindHolder(MyViewHolder viewHolder, int position) {
                viewHolder.getBinding().setVariable(BR.value,lists.get(position));
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
                adapter.addData(lists);
            }
        }, 5000);
    }


}
