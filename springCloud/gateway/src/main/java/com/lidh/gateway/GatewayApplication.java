package com.lidh.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    private static final Logger log = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {

        log.info("===============================================================================");
        log.info("开始启动ZullApplication...");
        SpringApplication.run(GatewayApplication.class, args);

        log.info("ZullApplication 启动成功！");
        log.info("===============================================================================");

    }
}
