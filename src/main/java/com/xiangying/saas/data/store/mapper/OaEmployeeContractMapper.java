package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaEmployeeContract;

public interface OaEmployeeContractMapper {
    int deleteByPrimaryKey(String oaEmployeeContractId);

    int insert(OaEmployeeContract record);

    int insertSelective(OaEmployeeContract record);

    OaEmployeeContract selectByPrimaryKey(String oaEmployeeContractId);

    int updateByPrimaryKeySelective(OaEmployeeContract record);

    int updateByPrimaryKey(OaEmployeeContract record);
}