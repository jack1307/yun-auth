package com.wang.yun.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching
@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication
public class YunAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunAuthApplication.class, args);
    }

}
