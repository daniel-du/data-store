package com.xiangying.saas.data.store.consumer;

import com.xiangying.saas.common.constant.CommonConstant;
import com.xiangying.saas.common.constant.MQConstant;
import com.xiangying.saas.common.enums.RBMQTopicEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author Du Penglun
 * @version 1.0
 * @date 2023/1/4 16:23
 * @description
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = MQConstant.INCREMENTAL_DATA_TOPIC_FIRST,
        consumerGroup = MQConstant.RB_MQ_GROUP, consumeMode = ConsumeMode.ORDERLY)
public class IncrementalDataFirstConsumer  implements RocketMQListener<String> {


    @Override
    public void onMessage(String s) {

        log.info("TestConsumer接收消息：{}", s);
    }
}
