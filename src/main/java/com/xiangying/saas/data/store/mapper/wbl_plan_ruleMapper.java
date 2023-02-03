package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblPlanRule;

public interface wbl_plan_ruleMapper {
    int deleteByPrimaryKey(String wblPlanRuleId);

    int insert(WblPlanRule record);

    int insertSelective(WblPlanRule record);

    WblPlanRule selectByPrimaryKey(String wblPlanRuleId);

    int updateByPrimaryKeySelective(WblPlanRule record);

    int updateByPrimaryKey(WblPlanRule record);
}