package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkLiveAnchoragent;

public interface MkLiveAnchoragentMapper {
    int deleteByPrimaryKey(String mkLiveAnchoragentId);

    int insert(MkLiveAnchoragent record);

    int insertSelective(MkLiveAnchoragent record);

    MkLiveAnchoragent selectByPrimaryKey(String mkLiveAnchoragentId);

    int updateByPrimaryKeySelective(MkLiveAnchoragent record);

    int updateByPrimaryKey(MkLiveAnchoragent record);
}