package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyRole;

public interface OaCompanyRoleMapper {
    int deleteByPrimaryKey(String oaCompanyRoleCode);

    int insert(OaCompanyRole record);

    int insertSelective(OaCompanyRole record);

    OaCompanyRole selectByPrimaryKey(String oaCompanyRoleCode);

    int updateByPrimaryKeySelective(OaCompanyRole record);

    int updateByPrimaryKey(OaCompanyRole record);
}