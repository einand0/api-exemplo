package com.example.apiexemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiExemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiExemploApplication.class, args);
	}

}
