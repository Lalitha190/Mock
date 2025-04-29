package com.example.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	private String name="Benz";
	
	private VehicleService vehicleservice;
	
	@Autowired
	public Vehicle(VehicleService vehicleservice) {
		super();
		this.vehicleservice=vehicleservice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	public void printHello() {
		System.out.println("printing hello from Vehicle class");
	}

	
}
	