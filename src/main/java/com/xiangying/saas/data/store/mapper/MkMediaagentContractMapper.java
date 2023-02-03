package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMediaagentContract;

public interface MkMediaagentContractMapper {
    int deleteByPrimaryKey(String mkMediaagentContractNo);

    int insert(MkMediaagentContract record);

    int insertSelective(MkMediaagentContract record);

    MkMediaagentContract selectByPrimaryKey(String mkMediaagentContractNo);

    int updateByPrimaryKeySelective(MkMediaagentContract record);

    int updateByPrimaryKey(MkMediaagentContract record);
}