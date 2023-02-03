package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblNoticeUser;

public interface WblNoticeUserMapper {
    int deleteByPrimaryKey(String wblNoticeUserId);

    int insert(WblNoticeUser record);

    int insertSelective(WblNoticeUser record);

    WblNoticeUser selectByPrimaryKey(String wblNoticeUserId);

    int updateByPrimaryKeySelective(WblNoticeUser record);

    int updateByPrimaryKey(WblNoticeUser record);
}