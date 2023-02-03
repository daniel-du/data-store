package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLiveSchedule;

public interface MkLiveScheduleMapper {
    int deleteByPrimaryKey(String mkLiveScheduleId);

    int insert(MkLiveSchedule record);

    int insertSelective(MkLiveSchedule record);

    MkLiveSchedule selectByPrimaryKey(String mkLiveScheduleId);

    int updateByPrimaryKeySelective(MkLiveSchedule record);

    int updateByPrimaryKey(MkLiveSchedule record);
}