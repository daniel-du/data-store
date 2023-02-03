package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserFirstagent;

public interface MkAdvertiserFirstagentMapper {
    int deleteByPrimaryKey(String mkMediaAgentNo);

    int insert(MkAdvertiserFirstagent record);

    int insertSelective(MkAdvertiserFirstagent record);

    MkAdvertiserFirstagent selectByPrimaryKey(String mkMediaAgentNo);

    int updateByPrimaryKeySelective(MkAdvertiserFirstagent record);

    int updateByPrimaryKey(MkAdvertiserFirstagent record);
}