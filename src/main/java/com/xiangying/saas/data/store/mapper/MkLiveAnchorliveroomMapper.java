package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLiveAnchorliveroom;

public interface MkLiveAnchorliveroomMapper {
    int deleteByPrimaryKey(String mkLiveAnchorliveroomId);

    int insert(MkLiveAnchorliveroom record);

    int insertSelective(MkLiveAnchorliveroom record);

    MkLiveAnchorliveroom selectByPrimaryKey(String mkLiveAnchorliveroomId);

    int updateByPrimaryKeySelective(MkLiveAnchorliveroom record);

    int updateByPrimaryKey(MkLiveAnchorliveroom record);
}