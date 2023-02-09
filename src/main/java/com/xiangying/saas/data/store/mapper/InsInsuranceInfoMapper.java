package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.InsInsuranceInfo;

public interface InsInsuranceInfoMapper {
    int deleteByPrimaryKey(String insInsuranceInfoCode);

    int insert(InsInsuranceInfo record);

    int insertSelective(InsInsuranceInfo record);

    InsInsuranceInfo selectByPrimaryKey(String insInsuranceInfoCode);

    int updateByPrimaryKeySelective(InsInsuranceInfo record);

    int updateByPrimaryKey(InsInsuranceInfo record);
}