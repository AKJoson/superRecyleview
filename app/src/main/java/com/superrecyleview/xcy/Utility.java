package com.superrecyleview.xcy;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

/**
 * just manager your BindingAdapter.
 */
public class Utility {

    @BindingAdapter(value = {"adapter", "itemDecoration", "layoutMananger"}, requireAll = false)
    public static void setRecyleViewProperty(RecyclerView recyclerView, RecyclerView.Adapter adapter, RecyclerView.ItemDecoration itemDecoration, RecyclerView.LayoutManager layoutManager) {
        if (recyclerView != null) {
            if (adapter != null) {
                recyclerView.setAdapter(adapter);
            }
            if (itemDecoration != null && recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(itemDecoration);
            }
            if (layoutManager != null) {
                recyclerView.setLayoutManager(layoutManager);
            }
        }
    }
}
