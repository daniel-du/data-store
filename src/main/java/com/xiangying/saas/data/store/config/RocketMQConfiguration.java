package com.xiangying.saas.data.store.config;

import io.netty.channel.DefaultChannelId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Du Penglun
 * @version 1.0
 * @date 2023/1/10 16:33
 * @description
 */
@Configuration
public class RocketMQConfiguration {

    @Bean
    public DefaultChannelId newIDefaultChannelId(){
        return DefaultChannelId.newInstance();
    }

}
