package com.tang.framework.manager;

/**
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by Alan on 2019-10-03.
 */
public class RuntimeDataManager {

    private static RuntimeDataManager sRuntimeDataManager;

    public static void init() {
        sRuntimeDataManager = new RuntimeDataManager();
    }



}
