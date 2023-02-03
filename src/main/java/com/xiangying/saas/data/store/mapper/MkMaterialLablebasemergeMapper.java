package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMaterialLablebasemerge;

public interface MkMaterialLablebasemergeMapper {
    int deleteByPrimaryKey(String mkMaterialLablebaseMergeId);

    int insert(MkMaterialLablebasemerge record);

    int insertSelective(MkMaterialLablebasemerge record);

    MkMaterialLablebasemerge selectByPrimaryKey(String mkMaterialLablebaseMergeId);

    int updateByPrimaryKeySelective(MkMaterialLablebasemerge record);

    int updateByPrimaryKey(MkMaterialLablebasemerge record);
}