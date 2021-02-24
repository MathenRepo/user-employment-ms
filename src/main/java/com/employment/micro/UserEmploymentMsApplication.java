package com.employment.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class UserEmploymentMsApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	@LoadBalanced
	public WebClient.Builder getReactiveWebTemplate() {
		WebClient.Builder webClient = WebClient.builder();
		return webClient;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserEmploymentMsApplication.class, args);
	}

}
