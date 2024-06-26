package com.final_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class FinalApplication {
	public static void main(String[] args) {
		SpringApplication.run(FinalApplication.class, args);
	}
}
