package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMediaAgentDiscountnotes;

public interface MkMediaAgentDiscountnotesMapper {
    int deleteByPrimaryKey(String mkMediaAgentDiscountnotesno);

    int insert(MkMediaAgentDiscountnotes record);

    int insertSelective(MkMediaAgentDiscountnotes record);

    MkMediaAgentDiscountnotes selectByPrimaryKey(String mkMediaAgentDiscountnotesno);

    int updateByPrimaryKeySelective(MkMediaAgentDiscountnotes record);

    int updateByPrimaryKey(MkMediaAgentDiscountnotes record);
}