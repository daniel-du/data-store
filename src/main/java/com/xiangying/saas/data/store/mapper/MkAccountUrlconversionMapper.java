package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAccountUrlconversion;

public interface MkAccountUrlconversionMapper {
    int deleteByPrimaryKey(String mkAccountUrlconversionCode);

    int insert(MkAccountUrlconversion record);

    int insertSelective(MkAccountUrlconversion record);

    MkAccountUrlconversion selectByPrimaryKey(String mkAccountUrlconversionCode);

    int updateByPrimaryKeySelective(MkAccountUrlconversion record);

    int updateByPrimaryKey(MkAccountUrlconversion record);
}