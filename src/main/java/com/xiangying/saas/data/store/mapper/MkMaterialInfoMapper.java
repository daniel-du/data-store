package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMaterialInfo;

public interface MkMaterialInfoMapper {
    int deleteByPrimaryKey(String mkMaterialInfoId);

    int insert(MkMaterialInfo record);

    int insertSelective(MkMaterialInfo record);

    MkMaterialInfo selectByPrimaryKey(String mkMaterialInfoId);

    int updateByPrimaryKeySelective(MkMaterialInfo record);

    int updateByPrimaryKey(MkMaterialInfo record);
}