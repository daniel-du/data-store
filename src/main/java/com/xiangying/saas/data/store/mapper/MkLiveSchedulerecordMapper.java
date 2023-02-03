package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLiveSchedulerecord;

public interface MkLiveSchedulerecordMapper {
    int deleteByPrimaryKey(String mkLiveScheduleId);

    int insert(MkLiveSchedulerecord record);

    int insertSelective(MkLiveSchedulerecord record);

    MkLiveSchedulerecord selectByPrimaryKey(String mkLiveScheduleId);

    int updateByPrimaryKeySelective(MkLiveSchedulerecord record);

    int updateByPrimaryKey(MkLiveSchedulerecord record);
}