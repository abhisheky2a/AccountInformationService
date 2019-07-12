package com.info.account.telecom.kool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.info.account.telecom.kool")
public class AccountInformationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountInformationServiceApplication.class, args);
	}

}
