package com.superrecyleview.xcy.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.superrecyleview.xcy.R;
import com.superrecyleview.xcy.databinding.ActivityMainBinding;
import com.superrecyleview.xcy.viewModel.ViewModel;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setViewModel(new ViewModel(mActivity));
    }
}
