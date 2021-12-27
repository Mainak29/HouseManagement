package com.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.house.controller"})
@EntityScan("com.house.model")
@EnableJpaRepositories("com.house.repo")
public class HouseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseManagementApplication.class, args);
	}

}
