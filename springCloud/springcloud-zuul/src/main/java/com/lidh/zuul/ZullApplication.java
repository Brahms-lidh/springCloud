package com.lidh.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZullApplication {

	private static final Logger log = LoggerFactory.getLogger(ZullApplication.class);

	/***
	 * @Title: main
	 * @Description: springCloud-zuul微服务网关服务启动类
	 * @param @param args 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		log.info("===============================================================================");
		log.info("开始启动ZullApplication...");
		
		SpringApplication.run(ZullApplication.class, args);
		log.info("ZullApplication 启动成功！");
		log.info("===============================================================================");
	}
	
}
