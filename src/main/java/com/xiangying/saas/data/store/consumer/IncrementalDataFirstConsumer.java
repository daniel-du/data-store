package com.xiangying.saas.data.store.consumer;

import com.alibaba.fastjson.JSONObject;
import com.xiangying.saas.common.dto.DataDetail;
import com.xiangying.saas.data.store.constant.Constant;
import com.xiangying.saas.data.store.dao.DAO;
import com.xiangying.saas.data.store.mapper.CusBasicWechatMapper;
import com.xiangying.saas.data.store.model.CusBasicWechat;
import com.xiangying.saas.data.store.service.DataConsumerService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.remoting.netty.NettyRemotingClient;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQPushConsumerLifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * @author Du Penglun
 * @version 1.0
 * @date 2023/1/4 16:23
 * @description
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "saasIncrementalDataTopic1",
        consumerGroup = "saas-group", consumeMode = ConsumeMode.ORDERLY, consumeTimeout = 60000L)
public class IncrementalDataFirstConsumer  implements RocketMQListener<String>, RocketMQPushConsumerLifecycleListener {


    /**
     * 数据存储服务
     */
    @Autowired
    private DataConsumerService dataConsumerService;

    @SneakyThrows
    @Override
    public void onMessage(String s) {
        DataDetail dataDetail = JSONObject.parseObject(s, DataDetail.class);
        log.info("IncrementalDataFirstConsumer接收消息, dataDetail：{}", JSONObject.toJSONString(dataDetail));
        dataConsumerService.saveData(dataDetail);
        log.info("IncrementalDataFirstConsumer消费结束");
    }


    @Override
    public void prepareStart(DefaultMQPushConsumer defaultMQPushConsumer) {
        defaultMQPushConsumer.setMaxReconsumeTimes(Integer.MAX_VALUE);
    }
}
