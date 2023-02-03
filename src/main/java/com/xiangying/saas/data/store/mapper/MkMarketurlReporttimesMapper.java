package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.MkMarketurlReporttimes;

public interface MkMarketurlReporttimesMapper {
    int deleteByPrimaryKey(String mkMarketurlReporttimesId);

    int insert(MkMarketurlReporttimes record);

    int insertSelective(MkMarketurlReporttimes record);

    MkMarketurlReporttimes selectByPrimaryKey(String mkMarketurlReporttimesId);

    int updateByPrimaryKeySelective(MkMarketurlReporttimes record);

    int updateByPrimaryKey(MkMarketurlReporttimes record);
}