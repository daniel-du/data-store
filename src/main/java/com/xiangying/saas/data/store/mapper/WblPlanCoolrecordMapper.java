package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblPlanCoolrecord;

public interface WblPlanCoolrecordMapper {
    int deleteByPrimaryKey(String wblPlanCoolrecordId);

    int insert(WblPlanCoolrecord record);

    int insertSelective(WblPlanCoolrecord record);

    WblPlanCoolrecord selectByPrimaryKey(String wblPlanCoolrecordId);

    int updateByPrimaryKeySelective(WblPlanCoolrecord record);

    int updateByPrimaryKey(WblPlanCoolrecord record);
}