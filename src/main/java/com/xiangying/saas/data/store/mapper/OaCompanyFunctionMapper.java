package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyFunction;

public interface OaCompanyFunctionMapper {
    int deleteByPrimaryKey(String oaCompanyFunctionCode);

    int insert(OaCompanyFunction record);

    int insertSelective(OaCompanyFunction record);

    OaCompanyFunction selectByPrimaryKey(String oaCompanyFunctionCode);

    int updateByPrimaryKeySelective(OaCompanyFunction record);

    int updateByPrimaryKey(OaCompanyFunction record);
}