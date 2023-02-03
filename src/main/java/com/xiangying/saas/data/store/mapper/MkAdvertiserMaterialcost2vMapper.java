package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserMaterialcost2v;

public interface MkAdvertiserMaterialcost2vMapper {
    int deleteByPrimaryKey(String mkAdvertiserMaterialcostNo);

    int insert(MkAdvertiserMaterialcost2v record);

    int insertSelective(MkAdvertiserMaterialcost2v record);

    MkAdvertiserMaterialcost2v selectByPrimaryKey(String mkAdvertiserMaterialcostNo);

    int updateByPrimaryKeySelective(MkAdvertiserMaterialcost2v record);

    int updateByPrimaryKey(MkAdvertiserMaterialcost2v record);
}