package com.maina.MainaApp.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.maina")
@ComponentScan(basePackages = "com.maina")
@EnableJpaRepositories(basePackages = "com.maina")
public class MainaAppStarter {

	public static void main(String[] args) {
		SpringApplication.run(MainaAppStarter.class, args);
	}

}
