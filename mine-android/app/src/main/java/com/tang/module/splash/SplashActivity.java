package com.tang.module.splash;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tang.R;
import com.tang.framework.base.BaseActivity;
import com.tang.framework.theme.ThemeUtils;
import com.tang.framework.theme.base.BaseView;
import com.tang.framework.theme.base.ThemeTextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;

/**
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by @author Alan on 2019-09-26.
 */
public class SplashActivity extends BaseActivity {

    private ThemeTextView mView;

    private Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void initView() {
        this.mView = findViewById(R.id.view);
        this.mButton = findViewById(R.id.btn_change);

        this.mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThemeUtils.changeTheme();
                mView.postInvalidate();
            }
        });
    }
}
