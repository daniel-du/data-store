package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserApp;

public interface MkAdvertiserAppMapper {
    int insert(MkAdvertiserApp record);

    int insertSelective(MkAdvertiserApp record);
}