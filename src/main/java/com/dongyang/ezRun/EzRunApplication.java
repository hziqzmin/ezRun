package com.dongyang.ezRun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.dongyang.ezRun.repository")
@EntityScan(basePackages = "com.dongyang.ezRun.entity")
public class EzRunApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzRunApplication.class, args);
	}

}
