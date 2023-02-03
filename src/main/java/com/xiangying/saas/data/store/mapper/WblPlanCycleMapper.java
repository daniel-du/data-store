package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblPlanCycle;

public interface WblPlanCycleMapper {
    int deleteByPrimaryKey(String wblPlanConfigId);

    int insert(WblPlanCycle record);

    int insertSelective(WblPlanCycle record);

    WblPlanCycle selectByPrimaryKey(String wblPlanConfigId);

    int updateByPrimaryKeySelective(WblPlanCycle record);

    int updateByPrimaryKey(WblPlanCycle record);
}