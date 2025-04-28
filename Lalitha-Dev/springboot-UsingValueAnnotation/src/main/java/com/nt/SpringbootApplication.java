package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.bindings.Student;
import com.nt.serv.Employee;

@SpringBootApplication
public class SpringbootApplication {
	@Autowired
	private  Student student;
	
	@Autowired
	private Employee employee;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		
	
		
	}

}
