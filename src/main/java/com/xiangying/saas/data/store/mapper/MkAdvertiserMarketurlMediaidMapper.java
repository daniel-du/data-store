package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserMarketurlMediaid;

public interface MkAdvertiserMarketurlMediaidMapper {
    int deleteByPrimaryKey(String mkAdvertiserMarketurlMediaidCode);

    int insert(MkAdvertiserMarketurlMediaid record);

    int insertSelective(MkAdvertiserMarketurlMediaid record);

    MkAdvertiserMarketurlMediaid selectByPrimaryKey(String mkAdvertiserMarketurlMediaidCode);

    int updateByPrimaryKeySelective(MkAdvertiserMarketurlMediaid record);

    int updateByPrimaryKey(MkAdvertiserMarketurlMediaid record);
}