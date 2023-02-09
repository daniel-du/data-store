package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaEmployeeInfo;

public interface OaEmployeeInfoMapper {
    int deleteByPrimaryKey(String oaEmployeeInfoCode);

    int insert(OaEmployeeInfo record);

    int insertSelective(OaEmployeeInfo record);

    OaEmployeeInfo selectByPrimaryKey(String oaEmployeeInfoCode);

    int updateByPrimaryKeySelective(OaEmployeeInfo record);

    int updateByPrimaryKey(OaEmployeeInfo record);
}