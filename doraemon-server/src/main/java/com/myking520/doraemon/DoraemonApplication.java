package com.myking520.doraemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringBootApplication

public class DoraemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoraemonApplication.class, args);
	}

}
