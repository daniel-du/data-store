package com.xiangying.saas.data.store;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Du Penglun
 * @version 1.0
 * @date 2023/1/5 16:43
 * @description
 */
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "com.xiangying.saas.data.store.mapper")
public class SaasDataStoreApplication {

    public static void main(String[] args) {
        try {
            log.info("==========SaasDataStore Start SUCCESS==========");
            SpringApplication.run(SaasDataStoreApplication.class, args);
            log.info("==========SaasDataStore End SUCCESS==========");
        }catch (Exception e){
            log.error("=========SaasDataStore End Exception==========",e);
        }
    }
}
