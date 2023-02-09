package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyRolefunction;

public interface OaCompanyRolefunctionMapper {
    int deleteByPrimaryKey(String oaCompanyRolefunctionNo);

    int insert(OaCompanyRolefunction record);

    int insertSelective(OaCompanyRolefunction record);

    OaCompanyRolefunction selectByPrimaryKey(String oaCompanyRolefunctionNo);

    int updateByPrimaryKeySelective(OaCompanyRolefunction record);

    int updateByPrimaryKey(OaCompanyRolefunction record);
}