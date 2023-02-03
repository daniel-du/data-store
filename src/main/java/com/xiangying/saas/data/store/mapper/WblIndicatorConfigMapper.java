package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblIndicatorConfig;

public interface WblIndicatorConfigMapper {
    int deleteByPrimaryKey(String wblIndicatorConfigId);

    int insert(WblIndicatorConfig record);

    int insertSelective(WblIndicatorConfig record);

    WblIndicatorConfig selectByPrimaryKey(String wblIndicatorConfigId);

    int updateByPrimaryKeySelective(WblIndicatorConfig record);

    int updateByPrimaryKey(WblIndicatorConfig record);
}