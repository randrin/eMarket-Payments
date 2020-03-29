package com.eMarket.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EMarketPaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMarketPaymentsApplication.class, args);
	}

}
