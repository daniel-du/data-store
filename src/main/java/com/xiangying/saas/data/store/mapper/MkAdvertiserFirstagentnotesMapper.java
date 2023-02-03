package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserFirstagentnotes;

public interface MkAdvertiserFirstagentnotesMapper {
    int deleteByPrimaryKey(String mkMediaAgentNo);

    int insert(MkAdvertiserFirstagentnotes record);

    int insertSelective(MkAdvertiserFirstagentnotes record);

    MkAdvertiserFirstagentnotes selectByPrimaryKey(String mkMediaAgentNo);

    int updateByPrimaryKeySelective(MkAdvertiserFirstagentnotes record);

    int updateByPrimaryKey(MkAdvertiserFirstagentnotes record);
}