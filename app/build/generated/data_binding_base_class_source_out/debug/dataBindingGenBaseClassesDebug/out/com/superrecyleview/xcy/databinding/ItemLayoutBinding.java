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
import android.widget.TextView;

public abstract class ItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView itemName;

  @Bindable
  protected String mValue;

  protected ItemLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView itemName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemName = itemName;
  }

  public abstract void setValue(@Nullable String value);

  @Nullable
  public String getValue() {
    return mValue;
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemLayoutBinding>inflate(inflater, com.superrecyleview.xcy.R.layout.item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemLayoutBinding>inflate(inflater, com.superrecyleview.xcy.R.layout.item_layout, null, false, component);
  }

  public static ItemLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemLayoutBinding)bind(component, view, com.superrecyleview.xcy.R.layout.item_layout);
  }
}
