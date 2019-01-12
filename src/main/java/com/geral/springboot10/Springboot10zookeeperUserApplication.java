package com.geral.springboot10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1.引入依赖
 * 2.配置dubbo的注册中心地址
 * 3.引用服务
 * @author Panhui
 *
 */
@SpringBootApplication
public class Springboot10zookeeperUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot10zookeeperUserApplication.class, args);
	}

}

