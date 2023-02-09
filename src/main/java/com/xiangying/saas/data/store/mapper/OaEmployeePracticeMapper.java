package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaEmployeePractice;

public interface OaEmployeePracticeMapper {
    int deleteByPrimaryKey(String oaEmployeeInfoCode);

    int insert(OaEmployeePractice record);

    int insertSelective(OaEmployeePractice record);

    OaEmployeePractice selectByPrimaryKey(String oaEmployeeInfoCode);

    int updateByPrimaryKeySelective(OaEmployeePractice record);

    int updateByPrimaryKey(OaEmployeePractice record);
}