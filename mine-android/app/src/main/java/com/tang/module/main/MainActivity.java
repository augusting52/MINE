package com.tang.module.main;

import android.os.Bundle;

import com.tang.R;
import com.tang.framework.base.BaseActivity;
import com.tang.framework.base.BaseFragment;
import com.tang.module.chat.ChatFragment;
import com.tang.module.data.DataFragment;
import com.tang.module.mine.MineFragment;
import com.tang.module.plan.PlanFragment;
import com.tang.module.todo.TodoFragment;
import com.tang.widget.BaseViewPager;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

/**
 * Created by @author Alan on 2019-10-27.
 */
public class MainActivity extends BaseActivity {

    private List<BaseFragment> mBaseFragmentList;

    private BaseViewPager mMainContent;

    private MainContentFragmentAdapter mFragmentAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainContent = this.findViewById(R.id.vp_content);
        initView();
    }

    @Override
    protected void initView() {
        mBaseFragmentList = new ArrayList<>();
        mBaseFragmentList.add(new TodoFragment());
        mBaseFragmentList.add(new PlanFragment());
        mBaseFragmentList.add(new DataFragment());
        mBaseFragmentList.add(new ChatFragment());
        mBaseFragmentList.add(new MineFragment());

        mFragmentAdapter = new MainContentFragmentAdapter(getSupportFragmentManager(), mBaseFragmentList);
        mMainContent.setAdapter(mFragmentAdapter);
    }
}
