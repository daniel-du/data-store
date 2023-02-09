package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaEmployeeTrain;

public interface OaEmployeeTrainMapper {
    int deleteByPrimaryKey(String oaEmployeeTrainId);

    int insert(OaEmployeeTrain record);

    int insertSelective(OaEmployeeTrain record);

    OaEmployeeTrain selectByPrimaryKey(String oaEmployeeTrainId);

    int updateByPrimaryKeySelective(OaEmployeeTrain record);

    int updateByPrimaryKey(OaEmployeeTrain record);
}