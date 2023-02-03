package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMediaLive;

public interface MkMediaLiveMapper {
    int deleteByPrimaryKey(String mkMediaLiveCode);

    int insert(MkMediaLive record);

    int insertSelective(MkMediaLive record);

    MkMediaLive selectByPrimaryKey(String mkMediaLiveCode);

    int updateByPrimaryKeySelective(MkMediaLive record);

    int updateByPrimaryKey(MkMediaLive record);
}