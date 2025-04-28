package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootProj3Application {
	@Autowired
	private static CarTypes type;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj3Application.class, args);
		
	}

}
