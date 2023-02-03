package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMediaAgentDiscount;

public interface MkMediaAgentDiscountMapper {
    int deleteByPrimaryKey(String mkMediaAgentDiscountno);

    int insert(MkMediaAgentDiscount record);

    int insertSelective(MkMediaAgentDiscount record);

    MkMediaAgentDiscount selectByPrimaryKey(String mkMediaAgentDiscountno);

    int updateByPrimaryKeySelective(MkMediaAgentDiscount record);

    int updateByPrimaryKey(MkMediaAgentDiscount record);
}