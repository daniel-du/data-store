package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLiveLink;

public interface MkLiveLinkMapper {
    int deleteByPrimaryKey(String mkAdvertiserMarketurlCode);

    int insert(MkLiveLink record);

    int insertSelective(MkLiveLink record);

    MkLiveLink selectByPrimaryKey(String mkAdvertiserMarketurlCode);

    int updateByPrimaryKeySelective(MkLiveLink record);

    int updateByPrimaryKey(MkLiveLink record);
}