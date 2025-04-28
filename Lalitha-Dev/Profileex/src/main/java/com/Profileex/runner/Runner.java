package com.Profileex.runner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.Profileex.input.GenericService;
@Component
@Order(1)
public class Runner implements CommandLineRunner {
	@Autowired
	private GenericService genericservice;

	@Override
	public void run(String... args) throws Exception {
		
		genericservice.task();
	}
	
	
}
