package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblNoticeInfo;

public interface WblNoticeInfoMapper {
    int deleteByPrimaryKey(String wblNoticeInfoId);

    int insert(WblNoticeInfo record);

    int insertSelective(WblNoticeInfo record);

    WblNoticeInfo selectByPrimaryKey(String wblNoticeInfoId);

    int updateByPrimaryKeySelective(WblNoticeInfo record);

    int updateByPrimaryKey(WblNoticeInfo record);
}