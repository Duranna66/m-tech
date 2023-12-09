package com.example.m_tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(MTechApplication.class, args);
	}

}
