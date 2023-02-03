package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblIndicatorRule;

public interface WblIndicatorRuleMapper {
    int deleteByPrimaryKey(String wblIndicatorRuleId);

    int insert(WblIndicatorRule record);

    int insertSelective(WblIndicatorRule record);

    WblIndicatorRule selectByPrimaryKey(String wblIndicatorRuleId);

    int updateByPrimaryKeySelective(WblIndicatorRule record);

    int updateByPrimaryKey(WblIndicatorRule record);
}