package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaMerchantCompanybody;

public interface OaMerchantCompanybodyMapper {
    int deleteByPrimaryKey(String oaMerchantCompanybodyNo);

    int insert(OaMerchantCompanybody record);

    int insertSelective(OaMerchantCompanybody record);

    OaMerchantCompanybody selectByPrimaryKey(String oaMerchantCompanybodyNo);

    int updateByPrimaryKeySelective(OaMerchantCompanybody record);

    int updateByPrimaryKey(OaMerchantCompanybody record);
}