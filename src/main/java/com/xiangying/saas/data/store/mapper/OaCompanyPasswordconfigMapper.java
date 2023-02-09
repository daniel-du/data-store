package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyPasswordconfig;

public interface OaCompanyPasswordconfigMapper {
    int deleteByPrimaryKey(Integer oaCompanyId);

    int insert(OaCompanyPasswordconfig record);

    int insertSelective(OaCompanyPasswordconfig record);

    OaCompanyPasswordconfig selectByPrimaryKey(Integer oaCompanyId);

    int updateByPrimaryKeySelective(OaCompanyPasswordconfig record);

    int updateByPrimaryKey(OaCompanyPasswordconfig record);
}