package com.example.starterboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient
public class StarterbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterbootApplication.class, args);
	}

	@Bean
//	@LoadBalanced
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
