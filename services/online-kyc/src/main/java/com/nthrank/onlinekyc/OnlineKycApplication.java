package com.nthrank.onlinekyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineKycApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineKycApplication.class, args);
	}

}
