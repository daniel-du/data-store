package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaMerchantAccount;

public interface OaMerchantAccountMapper {
    int deleteByPrimaryKey(String oaMerchantAccountNo);

    int insert(OaMerchantAccount record);

    int insertSelective(OaMerchantAccount record);

    OaMerchantAccount selectByPrimaryKey(String oaMerchantAccountNo);

    int updateByPrimaryKeySelective(OaMerchantAccount record);

    int updateByPrimaryKey(OaMerchantAccount record);
}