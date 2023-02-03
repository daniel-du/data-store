package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblPlanInform;

public interface WblPlanInformMapper {
    int deleteByPrimaryKey(String wblPlanInformId);

    int insert(WblPlanInform record);

    int insertSelective(WblPlanInform record);

    WblPlanInform selectByPrimaryKey(String wblPlanInformId);

    int updateByPrimaryKeySelective(WblPlanInform record);

    int updateByPrimaryKey(WblPlanInform record);
}