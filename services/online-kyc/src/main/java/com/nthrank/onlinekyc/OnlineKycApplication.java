package com.nthrank.onlinekyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // Eureka dependent only
// or @EnableDiscoveryClient, for various other discovery frameworks like consul, zookeeper etc
public class OnlineKycApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineKycApplication.class, args);
	}

}
