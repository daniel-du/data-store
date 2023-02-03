package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAdvertiserMaterial;

public interface MkAdvertiserMaterialMapper {
    int insert(MkAdvertiserMaterial record);

    int insertSelective(MkAdvertiserMaterial record);
}