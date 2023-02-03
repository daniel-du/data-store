package com.xiangying.saas.data.store.service;

import com.alibaba.fastjson.JSONObject;
import com.xiangying.saas.common.dto.DataDetail;
import com.xiangying.saas.data.store.constant.Constant;
import com.xiangying.saas.data.store.dao.DAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 * @author Du Penglun
 * @version 1.0
 * @date 2023/1/16 11:25
 * @description 数据存储服务
 */
@Slf4j
@Service
public class DataConsumerServiceImpl implements DataConsumerService {

    @Autowired
    private DAO dao;

    /**
     * 数据存储
     * @param dataDetail
     */
    @Override
    public void saveData(DataDetail dataDetail) {
        try {
            String modelName = convertModelName(dataDetail.getDbTable());
            String methodName = Constant.MAPPER_METHOD_MAP.get(dataDetail.getRecordType());
            ClassLoader classLoader = this.getClass().getClassLoader();
            Class<?> operatorClass = classLoader.loadClass(Constant.MAPPER_PACKAGE_PATH +  modelName + "Mapper");
            Class<?> modelClass = classLoader.loadClass(Constant.MODEL_PACKAGE_PATH + modelName);
            log.info("operatorClass:{}, modelClass:{}", operatorClass.getName(), modelClass.getName());
//            Object modelIns = modelClass.newInstance();
//            Method method = operatorClass.getMethod("insertSelective", modelIns.getClass());
//            log.info("operatorClass:{}, method:{}", operatorClass.getName(), method.getName());
            Object jsonObject = JSONObject.toJavaObject(dataDetail.getFieldJson(), modelClass);
//            dao.save("CusBasicWechatMapper.insertSelective", jsonObject);
            dao.save(modelName + "Mapper." + methodName, jsonObject);
        } catch (DuplicateKeyException e) {
            log.error("主键重复", e.getMessage());
        } catch (Exception e) {
            log.error("消费异常", e);
        }
    }

    /**
     * 数据库表名转换为实体类名称
     * @param dbTable
     * @return
     */
    private static String convertModelName(String dbTable) {
        String fields[] = dbTable.split("_");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            char[] cs = fields[i].toCharArray();
            cs[0] -= 32;
            stringBuilder.append(String.valueOf(cs));
        }
        return stringBuilder.toString();
    }
}
