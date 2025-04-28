package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class Test implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is from Test class");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}

}
