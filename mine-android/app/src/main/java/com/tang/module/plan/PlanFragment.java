package com.tang.module.plan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tang.R;
import com.tang.framework.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by @author Alan on 2019-10-27.
 */
public class PlanFragment extends BaseFragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.test_layout, container, false);
        TextView textView = mContentView.findViewById(R.id.text);
        textView.setText("PLAN");
        return mContentView;
    }

}
