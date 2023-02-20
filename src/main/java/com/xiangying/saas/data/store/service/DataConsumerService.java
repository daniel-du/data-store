package com.xiangying.saas.data.store.service;

import com.xiangying.saas.common.dto.DataDetail;

/**
 * @author Du Penglun
 * @version 1.0
 * @date 2023/1/16 11:22
 * @description 数据存储服务
 */
public interface DataConsumerService {

    /**
     * 数据存储
     * @param dataDetail
     */
    void saveData(DataDetail dataDetail) throws ClassNotFoundException;
}
