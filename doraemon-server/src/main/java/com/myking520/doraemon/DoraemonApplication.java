package com.myking520.doraemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories(basePackages = "com.myking520.doraemon.codegeneration.infrastructure.jpa")
public class DoraemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoraemonApplication.class, args);
	}

}
