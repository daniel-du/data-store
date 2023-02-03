package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserMarketurl;

public interface MkAdvertiserMarketurlMapper {
    int deleteByPrimaryKey(String mkAdvertiserMarketurlCode);

    int insert(MkAdvertiserMarketurl record);

    int insertSelective(MkAdvertiserMarketurl record);

    MkAdvertiserMarketurl selectByPrimaryKey(String mkAdvertiserMarketurlCode);

    int updateByPrimaryKeySelective(MkAdvertiserMarketurl record);

    int updateByPrimaryKey(MkAdvertiserMarketurl record);
}