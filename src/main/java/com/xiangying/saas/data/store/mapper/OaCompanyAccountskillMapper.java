package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanyAccountskill;

public interface OaCompanyAccountskillMapper {
    int deleteByPrimaryKey(String oaCompanyAccountskillNo);

    int insert(OaCompanyAccountskill record);

    int insertSelective(OaCompanyAccountskill record);

    OaCompanyAccountskill selectByPrimaryKey(String oaCompanyAccountskillNo);

    int updateByPrimaryKeySelective(OaCompanyAccountskill record);

    int updateByPrimaryKey(OaCompanyAccountskill record);
}