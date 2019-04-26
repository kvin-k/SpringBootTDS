package com.capgemini.initilizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.capgemini.mycontroller")
@ComponentScan("com.capgemini.dao")
@ComponentScan("com.capgemini.service")
@ComponentScan("com.capgemini.model")
@EntityScan(basePackages = {"com.capgemini.model"})
@SpringBootApplication
public class SpringBootTdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTdsApplication.class, args);
	}

}
