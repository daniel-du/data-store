package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLiveAnchor;

public interface MkLiveAnchorMapper {
    int deleteByPrimaryKey(String mkLiveAnchorCode);

    int insert(MkLiveAnchor record);

    int insertSelective(MkLiveAnchor record);

    MkLiveAnchor selectByPrimaryKey(String mkLiveAnchorCode);

    int updateByPrimaryKeySelective(MkLiveAnchor record);

    int updateByPrimaryKey(MkLiveAnchor record);
}