package com.yxd.sc_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // 启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication // 注解等价于以默认属性使用 @Configuration ，@EnableAutoConfiguration 和 @ComponentScan
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);  
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>!");
	}
}
