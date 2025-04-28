package com.fmc;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {
	
	private String name;
	 
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	  public void hello() 
	  { System.out.println("Hello");
	  	
	  }
	 
	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	public Vehicle() {
		super();
		
	}
	@PostConstruct
	public void printHello() {
		
		this.name="java";
	}
	
	@PreDestroy
	
	public void clear() {
		System.out.println("Destroying the  vehicle bean");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

