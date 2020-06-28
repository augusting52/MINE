package com.tang.framework.base;

import com.tang.framework.theme.Theme;

import lombok.Data;

/**
 * 存放内存中的实时数据
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by @author Alan on 2019-10-03.
 */
@Data
public class RuntimeData {

    private int theme = Theme.DAY.getTheme();

    public void init() {

    }

}
