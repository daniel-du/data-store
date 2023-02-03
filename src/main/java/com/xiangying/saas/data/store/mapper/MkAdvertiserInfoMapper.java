package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserInfo;

public interface MkAdvertiserInfoMapper {
    int deleteByPrimaryKey(String mkAdvertiserInfoCode);

    int insert(MkAdvertiserInfo record);

    int insertSelective(MkAdvertiserInfo record);

    MkAdvertiserInfo selectByPrimaryKey(String mkAdvertiserInfoCode);

    int updateByPrimaryKeySelective(MkAdvertiserInfo record);

    int updateByPrimaryKey(MkAdvertiserInfo record);
}