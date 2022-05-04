package com.example.EShoppingClientWithFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients (basePackages = "com.example.EShoppingClientWithFeign.app.service")
public class EShoppingClientWithFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EShoppingClientWithFeignApplication.class, args);
	}

}
