package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
    private Vehicle vehicle;
	
	public void use() {
		System.out.println("A person in going on vehicle");
		vehicle.start();
	}
}
