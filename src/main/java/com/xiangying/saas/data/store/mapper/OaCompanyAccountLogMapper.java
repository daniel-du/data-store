package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyAccountLog;

public interface OaCompanyAccountLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(OaCompanyAccountLog record);

    int insertSelective(OaCompanyAccountLog record);

    OaCompanyAccountLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(OaCompanyAccountLog record);

    int updateByPrimaryKey(OaCompanyAccountLog record);
}