package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.InsConfigCss;

public interface InsConfigCssMapper {
    int deleteByPrimaryKey(String insConfigCssCode);

    int insert(InsConfigCss record);

    int insertSelective(InsConfigCss record);

    InsConfigCss selectByPrimaryKey(String insConfigCssCode);

    int updateByPrimaryKeySelective(InsConfigCss record);

    int updateByPrimaryKey(InsConfigCss record);
}