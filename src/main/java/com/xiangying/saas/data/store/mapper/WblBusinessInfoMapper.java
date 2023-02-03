package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblBusinessInfo;

public interface WblBusinessInfoMapper {
    int deleteByPrimaryKey(String wblBusinessInfoId);

    int insert(WblBusinessInfo record);

    int insertSelective(WblBusinessInfo record);

    WblBusinessInfo selectByPrimaryKey(String wblBusinessInfoId);

    int updateByPrimaryKeySelective(WblBusinessInfo record);

    int updateByPrimaryKey(WblBusinessInfo record);
}