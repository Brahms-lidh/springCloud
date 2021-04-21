package com.lidh.eurakeServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    private static final Logger log = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        log.info("===============================================================================");
        log.info("开始启动EurekaApplication...");

        SpringApplication.run(EurekaApplication.class, args);

        log.info("EurekaApplication 启动成功！");
        log.info("===============================================================================");
    }

}
