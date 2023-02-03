package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserplanMonitorrecorddelayed;

public interface MkAdvertiserplanMonitorrecorddelayedMapper {
    int deleteByPrimaryKey(String mkAdvertiserplanMonitorrecordId);

    int insert(MkAdvertiserplanMonitorrecorddelayed record);

    int insertSelective(MkAdvertiserplanMonitorrecorddelayed record);

    MkAdvertiserplanMonitorrecorddelayed selectByPrimaryKey(String mkAdvertiserplanMonitorrecordId);

    int updateByPrimaryKeySelective(MkAdvertiserplanMonitorrecorddelayed record);

    int updateByPrimaryKey(MkAdvertiserplanMonitorrecorddelayed record);
}