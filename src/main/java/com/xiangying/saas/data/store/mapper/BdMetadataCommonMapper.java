package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.BdMetadataCommon;

public interface BdMetadataCommonMapper {
    int deleteByPrimaryKey(String bdMetadataCommonCode);

    int insert(BdMetadataCommon record);

    int insertSelective(BdMetadataCommon record);

    BdMetadataCommon selectByPrimaryKey(String bdMetadataCommonCode);

    int updateByPrimaryKeySelective(BdMetadataCommon record);

    int updateByPrimaryKey(BdMetadataCommon record);
}