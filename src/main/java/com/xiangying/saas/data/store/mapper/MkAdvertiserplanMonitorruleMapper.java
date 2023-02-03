package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserplanMonitorrule;

public interface MkAdvertiserplanMonitorruleMapper {
    int deleteByPrimaryKey(String mkAdvertiserplanMonitorruleId);

    int insert(MkAdvertiserplanMonitorrule record);

    int insertSelective(MkAdvertiserplanMonitorrule record);

    MkAdvertiserplanMonitorrule selectByPrimaryKey(String mkAdvertiserplanMonitorruleId);

    int updateByPrimaryKeySelective(MkAdvertiserplanMonitorrule record);

    int updateByPrimaryKey(MkAdvertiserplanMonitorrule record);
}