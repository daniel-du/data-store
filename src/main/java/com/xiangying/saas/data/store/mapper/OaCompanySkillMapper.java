package com.xiangying.saas.data.store.mapper;

import com.xiangying.saas.data.store.model.OaCompanySkill;

public interface OaCompanySkillMapper {
    int deleteByPrimaryKey(String oaCompanySkillCode);

    int insert(OaCompanySkill record);

    int insertSelective(OaCompanySkill record);

    OaCompanySkill selectByPrimaryKey(String oaCompanySkillCode);

    int updateByPrimaryKeySelective(OaCompanySkill record);

    int updateByPrimaryKey(OaCompanySkill record);
}