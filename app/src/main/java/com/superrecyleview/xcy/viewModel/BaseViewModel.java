package com.superrecyleview.xcy.viewModel;

import android.databinding.BaseObservable;
import android.support.v7.app.AppCompatActivity;

public class BaseViewModel extends BaseObservable {
    protected AppCompatActivity mActivity;

    public BaseViewModel(AppCompatActivity activity) {
        mActivity = activity;
    }
}
