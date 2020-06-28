package com.tang.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/**
 * Created by @author Alan on 2019-10-27.
 */
public class BaseViewPager extends ViewPager {

    private boolean mCanScrollHorizontally = true;

    public BaseViewPager(@NonNull Context context) {
        super(context);
    }

    public BaseViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return super.canScrollHorizontally(direction);
    }

    public void setCanScrollHorizontally(boolean canScrollHorizontally) {
        mCanScrollHorizontally = canScrollHorizontally;
    }
}
