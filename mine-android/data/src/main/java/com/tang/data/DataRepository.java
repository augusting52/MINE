package com.tang.data;

/**
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by Alan on 2019-09-28.
 */
public class DataRepository {

    private static DataRepository sInstance;

    /**x
     *
     * @param appDatabase
     * @return
     */
    public static DataRepository getInstance(AppDatabase appDatabase) {
        return sInstance;
    }

}
