package com.tang.framework.theme.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

import com.tang.R;
import com.tang.framework.theme.ThemeChangeHandler;
import com.tang.framework.theme.ThemeUtils;

import androidx.annotation.Nullable;

/**
 * Created by @author Alan on 2019-10-12.
 */
public class ThemeTextView extends TextView  implements ThemeChangeHandler {
    public ThemeTextView(Context context) {
        super(context);
    }

    public ThemeTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ThemeTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void handleThemeChanged() {
        if (ThemeUtils.isNight()) {
            this.setTextColor(Color.BLUE);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        handleThemeChanged();
        super.onDraw(canvas);
    }
}
