package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaMerchantInfo;

public interface OaMerchantInfoMapper {
    int deleteByPrimaryKey(String oaMerchantInfoNo);

    int insert(OaMerchantInfo record);

    int insertSelective(OaMerchantInfo record);

    OaMerchantInfo selectByPrimaryKey(String oaMerchantInfoNo);

    int updateByPrimaryKeySelective(OaMerchantInfo record);

    int updateByPrimaryKey(OaMerchantInfo record);
}