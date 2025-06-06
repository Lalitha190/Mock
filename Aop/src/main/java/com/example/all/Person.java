package com.example.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name="sanvi";
	
    private Vehicle vehicle;

    @Autowired
	public Person (Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}
	
	
	
}
