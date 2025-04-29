package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.all.Song;
import com.example.all.VehicleService;
import com.example.config.AppConfig;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext  context= new AnnotationConfigApplicationContext(AppConfig.class);
		VehicleService vehicleServices=context.getBean(VehicleService.class);
		 
		 System.out.println(vehicleServices.getClass());
		 Song song=new Song();
		 song.setSingerName("Karthik");
		 song.setTitle("Hare rama");
		 boolean vehiclestarted=true;
		 
		 String moveVehicleStatus= vehicleServices.moveVehicle(vehiclestarted);
		 System.out.println(moveVehicleStatus);
		 
	}

}
