package com.hry.spring.rabbitmq.boot.simple1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitApplication1 {

	public static void main(String[] args) {
		if(args == null || args.length == 0) {
			args = new String[1];
			//	args[1] = "--spring.profiles.active=native";
			// 需要指定配置文件名称
			args[0]="--spring.config.name=application-boot";
		}
		SpringApplication.run(SpringBootRabbitApplication1.class, args);
	}
}
