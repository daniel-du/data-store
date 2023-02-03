package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMaterialAudit;

public interface MkMaterialAuditMapper {
    int deleteByPrimaryKey(String mkMaterialAuditId);

    int insert(MkMaterialAudit record);

    int insertSelective(MkMaterialAudit record);

    MkMaterialAudit selectByPrimaryKey(String mkMaterialAuditId);

    int updateByPrimaryKeySelective(MkMaterialAudit record);

    int updateByPrimaryKey(MkMaterialAudit record);
}