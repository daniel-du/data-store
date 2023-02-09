package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAccountcutUrlconversion;

public interface MkAccountcutUrlconversionMapper {
    int deleteByPrimaryKey(String mkAccountcutUrlconversionCode);

    int insert(MkAccountcutUrlconversion record);

    int insertSelective(MkAccountcutUrlconversion record);

    MkAccountcutUrlconversion selectByPrimaryKey(String mkAccountcutUrlconversionCode);

    int updateByPrimaryKeySelective(MkAccountcutUrlconversion record);

    int updateByPrimaryKey(MkAccountcutUrlconversion record);
}