package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMediaInfo;

public interface MkMediaInfoMapper {
    int insert(MkMediaInfo record);

    int insertSelective(MkMediaInfo record);
}