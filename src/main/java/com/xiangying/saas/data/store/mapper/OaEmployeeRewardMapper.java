package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaEmployeeReward;

public interface OaEmployeeRewardMapper {
    int deleteByPrimaryKey(String oaEmployeeRewardId);

    int insert(OaEmployeeReward record);

    int insertSelective(OaEmployeeReward record);

    OaEmployeeReward selectByPrimaryKey(String oaEmployeeRewardId);

    int updateByPrimaryKeySelective(OaEmployeeReward record);

    int updateByPrimaryKey(OaEmployeeReward record);
}