package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMaterialUpload;

public interface MkMaterialUploadMapper {
    int deleteByPrimaryKey(String mkMaterialUploadId);

    int insert(MkMaterialUpload record);

    int insertSelective(MkMaterialUpload record);

    MkMaterialUpload selectByPrimaryKey(String mkMaterialUploadId);

    int updateByPrimaryKeySelective(MkMaterialUpload record);

    int updateByPrimaryKey(MkMaterialUpload record);
}