package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserMedia;

public interface MkAdvertiserMediaMapper {
    int insert(MkAdvertiserMedia record);

    int insertSelective(MkAdvertiserMedia record);
}