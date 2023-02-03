package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserUrlconversion;

public interface MkAdvertiserUrlconversionMapper {
    int deleteByPrimaryKey(String mkAdvertiserUrlconversionNo);

    int insert(MkAdvertiserUrlconversion record);

    int insertSelective(MkAdvertiserUrlconversion record);

    MkAdvertiserUrlconversion selectByPrimaryKey(String mkAdvertiserUrlconversionNo);

    int updateByPrimaryKeySelective(MkAdvertiserUrlconversion record);

    int updateByPrimaryKey(MkAdvertiserUrlconversion record);
}