package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserMarketurldownflag;

public interface MkAdvertiserMarketurldownflagMapper {
    int deleteByPrimaryKey(String mkAdvertiserMarketurlId);

    int insert(MkAdvertiserMarketurldownflag record);

    int insertSelective(MkAdvertiserMarketurldownflag record);

    MkAdvertiserMarketurldownflag selectByPrimaryKey(String mkAdvertiserMarketurlId);

    int updateByPrimaryKeySelective(MkAdvertiserMarketurldownflag record);

    int updateByPrimaryKey(MkAdvertiserMarketurldownflag record);
}