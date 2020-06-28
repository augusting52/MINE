package com.tang.framework.base;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by @author Alan on 2019-09-26.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 初始化布局
     */
    protected abstract void initView();

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        notifyThemeChanged();

    }

    /**
     * 主题切换通知
     */
    private void notifyThemeChanged() {
        int currentTheme = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentTheme) {
            case Configuration.UI_MODE_NIGHT_YES:
                // TODO
                Log.d("libing", "----------");
                break;
            case Configuration.UI_MODE_NIGHT_NO:
                // TODO
                Log.d("libing", "==========");
                break;
            default:
                break;
        }
    }

}
