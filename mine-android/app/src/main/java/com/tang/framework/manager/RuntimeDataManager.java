package com.tang.framework.manager;

import lombok.Getter;

/**
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by Alan on 2019-10-03.
 */
public class RuntimeDataManager {

    @Getter
    private static RuntimeDataManager sRuntimeDataManager;

    public static void init() {
        sRuntimeDataManager = new RuntimeDataManager();
    }



}
