package com.tang.framework;

import android.app.Application;

import com.tang.data.AppDatabase;
import com.tang.data.DataRepository;
import com.tang.framework.base.RuntimeData;

import lombok.Data;
import lombok.Getter;

/**
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by @author Alan on 2019-09-26.
 */
public class MineApplication extends Application {

    private AppExecutors mAppExecutors;

    @Getter
    private RuntimeData mRuntimeData;

    @Getter
    private static MineApplication sMineApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        sMineApplication = this;
        mAppExecutors = new AppExecutors();
        mRuntimeData = new RuntimeData();
        mRuntimeData.init();
    }

    public AppDatabase getDatabase() {
        return AppDatabase.getInstance(this, mAppExecutors);
    }

    public DataRepository getRepository() {
        return DataRepository.getInstance(getDatabase());
    }


}
