package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyAccountrole;

public interface OaCompanyAccountroleMapper {
    int deleteByPrimaryKey(String oaCompanyAccountroleNo);

    int insert(OaCompanyAccountrole record);

    int insertSelective(OaCompanyAccountrole record);

    OaCompanyAccountrole selectByPrimaryKey(String oaCompanyAccountroleNo);

    int updateByPrimaryKeySelective(OaCompanyAccountrole record);

    int updateByPrimaryKey(OaCompanyAccountrole record);
}