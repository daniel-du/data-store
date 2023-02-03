package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserMaterialcost;

public interface MkAdvertiserMaterialcostMapper {
    int deleteByPrimaryKey(String mkAdvertiserMaterialcostNo);

    int insert(MkAdvertiserMaterialcost record);

    int insertSelective(MkAdvertiserMaterialcost record);

    MkAdvertiserMaterialcost selectByPrimaryKey(String mkAdvertiserMaterialcostNo);

    int updateByPrimaryKeySelective(MkAdvertiserMaterialcost record);

    int updateByPrimaryKey(MkAdvertiserMaterialcost record);
}