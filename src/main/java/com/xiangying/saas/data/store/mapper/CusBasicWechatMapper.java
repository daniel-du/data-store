package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.CusBasicWechat;

public interface CusBasicWechatMapper {
    int deleteByPrimaryKey(String cusBasicWechatUnionid);

    int insert(CusBasicWechat record);

    int insertSelective(CusBasicWechat record);

    CusBasicWechat selectByPrimaryKey(String cusBasicWechatUnionid);

    int updateByPrimaryKeySelective(CusBasicWechat record);

    int updateByPrimaryKey(CusBasicWechat record);
}