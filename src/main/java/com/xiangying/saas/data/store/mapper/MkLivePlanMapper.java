package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLivePlan;

public interface MkLivePlanMapper {
    int deleteByPrimaryKey(String mkLivePlanNo);

    int insert(MkLivePlan record);

    int insertSelective(MkLivePlan record);

    MkLivePlan selectByPrimaryKey(String mkLivePlanNo);

    int updateByPrimaryKeySelective(MkLivePlan record);

    int updateByPrimaryKey(MkLivePlan record);
}