package com.tang.module.todo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.tang.R;
import com.tang.framework.base.BaseFragment;
import com.tang.widget.BaseViewPager;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by @author Alan on 2019-10-27.
 */
public class TodoFragment extends BaseFragment {

    private List<String> mTabNames;

    private TabLayout mTodoTab;

    private BaseViewPager mTodoTabContent;

    private TodoContentAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.main_content_todo_fragment, container, false);
        mTodoTab = mContentView.findViewById(R.id.main_content_todo_tab);
        mTodoTabContent = mContentView.findViewById(R.id.main_content_todo_tab_content);
        initView();
        return mContentView;
    }

    private void initView() {
        mTabNames = new ArrayList<>();
        mTabNames.add("TAB01");
        mTabNames.add("TAB02");
        mTabNames.add("TAB03");

        mAdapter = new TodoContentAdapter(mTabNames);
        mTodoTabContent.setAdapter(mAdapter);
        mTodoTab.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTodoTab.setSaveEnabled(true);
        mTodoTab.setupWithViewPager(mTodoTabContent, false);
    }
}
