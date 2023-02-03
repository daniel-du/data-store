package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMaterialViewrecord;

public interface MkMaterialViewrecordMapper {
    int insert(MkMaterialViewrecord record);

    int insertSelective(MkMaterialViewrecord record);
}