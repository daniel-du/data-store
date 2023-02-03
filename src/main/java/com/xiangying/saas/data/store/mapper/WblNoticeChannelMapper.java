package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblNoticeChannel;

public interface WblNoticeChannelMapper {
    int deleteByPrimaryKey(String wblNoticeChannelId);

    int insert(WblNoticeChannel record);

    int insertSelective(WblNoticeChannel record);

    WblNoticeChannel selectByPrimaryKey(String wblNoticeChannelId);

    int updateByPrimaryKeySelective(WblNoticeChannel record);

    int updateByPrimaryKey(WblNoticeChannel record);
}