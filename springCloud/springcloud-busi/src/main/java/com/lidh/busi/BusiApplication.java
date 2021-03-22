package com.lidh.busi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class BusiApplication{
	
	private static final Logger logger = LoggerFactory.getLogger(BusiApplication.class);

	public static void main(String[] args) {
		
		logger.info("===============================================================================");
		logger.info("开始启动[BUSINESS-SERVICE][业务子系统]...");
		SpringApplication.run(BusiApplication.class, args);
		logger.info("[BUSINESS-SERVICE][业务子系统]启动成功.");
		logger.info("===============================================================================");
		
	}
	
}
