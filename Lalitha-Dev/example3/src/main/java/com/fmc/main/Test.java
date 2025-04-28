package com.fmc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Vehicle;
import com.fmc.config.ProjectConfig;


public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		 Vehicle veh=context.getBean(Vehicle.class);
		 System.out.println("get the beans "+veh.getName());
		veh.printHello();
	
	}  

}
