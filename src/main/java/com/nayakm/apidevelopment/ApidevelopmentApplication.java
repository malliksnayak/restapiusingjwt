package com.nayakm.apidevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nayakm.apidevelopment.repository")
@EntityScan(basePackages = "com.nayakm.apidevelopment.entity")
public class ApidevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidevelopmentApplication.class, args);
	}

}
