package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAgentAccount;

public interface MkAgentAccountMapper {
    int deleteByPrimaryKey(String mkAgentAccountNo);

    int insert(MkAgentAccount record);

    int insertSelective(MkAgentAccount record);

    MkAgentAccount selectByPrimaryKey(String mkAgentAccountNo);

    int updateByPrimaryKeySelective(MkAgentAccount record);

    int updateByPrimaryKey(MkAgentAccount record);
}