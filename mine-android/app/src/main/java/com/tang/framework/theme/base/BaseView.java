package com.tang.framework.theme.base;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.tang.framework.theme.ThemeChangeHandler;

import androidx.annotation.Nullable;

/**
 * Created by @author Alan on 2019-10-12.
 */
public class BaseView extends View implements ThemeChangeHandler {
    public BaseView(Context context) {
        super(context);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        handleThemeChanged();
        super.onDraw(canvas);
    }

    @Override
    public void handleThemeChanged() {

    }
}
