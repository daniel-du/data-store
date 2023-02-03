package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.WblPlanHoliday;

public interface WblPlanHolidayMapper {
    int deleteByPrimaryKey(Integer wblPlanHolidayId);

    int insert(WblPlanHoliday record);

    int insertSelective(WblPlanHoliday record);

    WblPlanHoliday selectByPrimaryKey(Integer wblPlanHolidayId);

    int updateByPrimaryKeySelective(WblPlanHoliday record);

    int updateByPrimaryKey(WblPlanHoliday record);
}