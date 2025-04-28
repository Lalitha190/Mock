package com.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.runner.example.Products;

@SpringBootApplication
public class ValueannotationexApplication {
	
	private Products types;

	public static void main(String[] args) {
		SpringApplication.run(ValueannotationexApplication.class, args);
		
		
	}

}
