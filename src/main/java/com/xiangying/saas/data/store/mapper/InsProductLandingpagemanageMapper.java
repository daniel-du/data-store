package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.InsProductLandingpagemanage;

public interface InsProductLandingpagemanageMapper {
    int deleteByPrimaryKey(String insProductLandingpagemanageno);

    int insert(InsProductLandingpagemanage record);

    int insertSelective(InsProductLandingpagemanage record);

    InsProductLandingpagemanage selectByPrimaryKey(String insProductLandingpagemanageno);

    int updateByPrimaryKeySelective(InsProductLandingpagemanage record);

    int updateByPrimaryKey(InsProductLandingpagemanage record);
}