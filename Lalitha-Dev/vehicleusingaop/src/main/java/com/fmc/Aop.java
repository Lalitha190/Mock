package com.fmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.AssignmentConfig;
import com.fmc.service.Song;
import com.fmc.service.VehicleService;

public class Aop {
	public static void main(String[] args) {
		ApplicationContext  context= new AnnotationConfigApplicationContext(AssignmentConfig.class);
			VehicleService vehicleServices=context.getBean(VehicleService.class);
			 
			 System.out.println(vehicleServices.getClass());
			 Song song=new Song();
			 song.setSingerName("Karthik");
			 song.setTitle("Hare rama");
			 boolean vehiclestarted=true;
			 
			 String moveVehicleStatus= vehicleServices.moveVehicle(vehiclestarted);
			 System.out.println(moveVehicleStatus);
			 
			String playMusicStatus=vehicleServices.playMusic(vehiclestarted,song);
			System.out.println(playMusicStatus);
			
		String	applyBrakeStatus=vehicleServices.applyBrake(vehiclestarted,song);
		System.out.println(applyBrakeStatus);
			 
			 
		}
	}






