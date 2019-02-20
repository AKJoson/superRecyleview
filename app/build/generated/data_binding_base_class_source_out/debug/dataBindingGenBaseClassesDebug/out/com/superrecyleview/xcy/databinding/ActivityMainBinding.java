package com.superrecyleview.xcy.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.superrecyleview.xcy.viewModel.ViewModel;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @Bindable
  protected ViewModel mViewModel;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable ViewModel viewModel);

  @Nullable
  public ViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.superrecyleview.xcy.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.superrecyleview.xcy.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, com.superrecyleview.xcy.R.layout.activity_main);
  }
}
