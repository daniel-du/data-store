package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaAccountGroup;

public interface OaAccountGroupMapper {
    int deleteByPrimaryKey(String oaAccountGroupCode);

    int insert(OaAccountGroup record);

    int insertSelective(OaAccountGroup record);

    OaAccountGroup selectByPrimaryKey(String oaAccountGroupCode);

    int updateByPrimaryKeySelective(OaAccountGroup record);

    int updateByPrimaryKey(OaAccountGroup record);
}