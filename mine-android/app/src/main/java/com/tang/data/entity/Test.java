package com.tang.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import lombok.Data;
import lombok.Getter;

/**
 * Copyright(c) 2017. LiBing Inc. All rights reserved.
 * <p>
 * Created by @author Alan on 2019-10-12.
 */
@Entity
@Data
public class Test {

    @PrimaryKey
    public Integer id;

    public String test;

}
