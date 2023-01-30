package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserPlancost;

public interface MkAdvertiserPlancostMapper {
    int deleteByPrimaryKey(String mkAdvertiserPlancostNo);

    int insert(MkAdvertiserPlancost record);

    int insertSelective(MkAdvertiserPlancost record);

    MkAdvertiserPlancost selectByPrimaryKey(String mkAdvertiserPlancostNo);

    int updateByPrimaryKeySelective(MkAdvertiserPlancost record);

    int updateByPrimaryKey(MkAdvertiserPlancost record);
}