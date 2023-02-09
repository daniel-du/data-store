package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.InsProductInfo;

public interface InsProductInfoMapper {
    int deleteByPrimaryKey(String insProductInfoCode);

    int insert(InsProductInfo record);

    int insertSelective(InsProductInfo record);

    InsProductInfo selectByPrimaryKey(String insProductInfoCode);

    int updateByPrimaryKeySelective(InsProductInfo record);

    int updateByPrimaryKey(InsProductInfo record);
}