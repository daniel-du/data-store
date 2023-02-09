package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkAccountCut;

public interface MkAccountCutMapper {
    int deleteByPrimaryKey(String mkAccountCutCode);

    int insert(MkAccountCut record);

    int insertSelective(MkAccountCut record);

    MkAccountCut selectByPrimaryKey(String mkAccountCutCode);

    int updateByPrimaryKeySelective(MkAccountCut record);

    int updateByPrimaryKey(MkAccountCut record);
}