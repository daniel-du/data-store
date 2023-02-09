package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.BdMetadataType;

public interface BdMetadataTypeMapper {
    int deleteByPrimaryKey(String bdMetadataTypeCode);

    int insert(BdMetadataType record);

    int insertSelective(BdMetadataType record);

    BdMetadataType selectByPrimaryKey(String bdMetadataTypeCode);

    int updateByPrimaryKeySelective(BdMetadataType record);

    int updateByPrimaryKey(BdMetadataType record);
}