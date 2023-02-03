package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblPlanConfig;

public interface WblPlanConfigMapper {
    int deleteByPrimaryKey(String wblPlanConfigId);

    int insert(WblPlanConfig record);

    int insertSelective(WblPlanConfig record);

    WblPlanConfig selectByPrimaryKey(String wblPlanConfigId);

    int updateByPrimaryKeySelective(WblPlanConfig record);

    int updateByPrimaryKey(WblPlanConfig record);
}