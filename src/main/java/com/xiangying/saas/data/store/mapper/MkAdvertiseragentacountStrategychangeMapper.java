package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiseragentacountStrategychange;

public interface MkAdvertiseragentacountStrategychangeMapper {
    int deleteByPrimaryKey(String mkAdvertiseragentacountStrategychangeId);

    int insert(MkAdvertiseragentacountStrategychange record);

    int insertSelective(MkAdvertiseragentacountStrategychange record);

    MkAdvertiseragentacountStrategychange selectByPrimaryKey(String mkAdvertiseragentacountStrategychangeId);

    int updateByPrimaryKeySelective(MkAdvertiseragentacountStrategychange record);

    int updateByPrimaryKey(MkAdvertiseragentacountStrategychange record);
}