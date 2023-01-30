package com.xiangying.saas.data.store.constant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Du Penglun
 * @version 1.0
 * @date 2023/1/14 11:39
 * @description 过滤字段配置-测试用
 */
public class Constant {


    public static final String MAPPER_PACKAGE_PATH = "com.xiangying.saas.data.store.mapper.";

    public static final String MODEL_PACKAGE_PATH = "com.xiangying.saas.data.store.model.";

    /**
     * 数据操作类型与mapper方法对应关系
     */
    public static final HashMap<String, String> MAPPER_METHOD_MAP = new HashMap<>();

    static {
        MAPPER_METHOD_MAP.put("INSERT", "insertSelective");
        MAPPER_METHOD_MAP.put("UPDATE", "updateByPrimaryKeySelective");
    }
}
