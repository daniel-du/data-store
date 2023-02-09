package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyAccount;

public interface OaCompanyAccountMapper {
    int deleteByPrimaryKey(String oaCompanyAccountCode);

    int insert(OaCompanyAccount record);

    int insertSelective(OaCompanyAccount record);

    OaCompanyAccount selectByPrimaryKey(String oaCompanyAccountCode);

    int updateByPrimaryKeySelective(OaCompanyAccount record);

    int updateByPrimaryKey(OaCompanyAccount record);
}