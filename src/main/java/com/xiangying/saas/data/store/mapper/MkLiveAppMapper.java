package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLiveApp;

public interface MkLiveAppMapper {
    int deleteByPrimaryKey(String mkLiveAppNo);

    int insert(MkLiveApp record);

    int insertSelective(MkLiveApp record);

    MkLiveApp selectByPrimaryKey(String mkLiveAppNo);

    int updateByPrimaryKeySelective(MkLiveApp record);

    int updateByPrimaryKey(MkLiveApp record);
}