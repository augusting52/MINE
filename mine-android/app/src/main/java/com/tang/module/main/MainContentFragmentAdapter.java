package com.tang.module.main;

import com.tang.framework.base.BaseFragment;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by @author Alan on 2019-10-27.
 */
public class MainContentFragmentAdapter extends FragmentStatePagerAdapter {

    private List<BaseFragment> mData;

    public MainContentFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public MainContentFragmentAdapter(@NonNull FragmentManager fm, List<BaseFragment> data) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.mData = data;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return this.mData.get(position);
    }

    @Override
    public int getCount() {
        return this.mData.size();
    }

}
