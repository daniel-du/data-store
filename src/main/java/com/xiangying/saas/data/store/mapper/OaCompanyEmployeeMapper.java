package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyEmployee;

public interface OaCompanyEmployeeMapper {
    int deleteByPrimaryKey(String oaCompanyEmployeeCode);

    int insert(OaCompanyEmployee record);

    int insertSelective(OaCompanyEmployee record);

    OaCompanyEmployee selectByPrimaryKey(String oaCompanyEmployeeCode);

    int updateByPrimaryKeySelective(OaCompanyEmployee record);

    int updateByPrimaryKey(OaCompanyEmployee record);
}