package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMaterialLablebase;

public interface MkMaterialLablebaseMapper {
    int deleteByPrimaryKey(String mkMaterialLablebaseId);

    int insert(MkMaterialLablebase record);

    int insertSelective(MkMaterialLablebase record);

    MkMaterialLablebase selectByPrimaryKey(String mkMaterialLablebaseId);

    int updateByPrimaryKeySelective(MkMaterialLablebase record);

    int updateByPrimaryKey(MkMaterialLablebase record);
}