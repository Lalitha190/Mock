package com.example.all;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
	 private Logger logger = Logger.getLogger(VehicleService.class.getName());

	    @Autowired
	    private Speaker speakers;
	    @Autowired
	    private Tyres tyres;
	    
	    public String playMusic(boolean vehiclestarted,Song song) {
	    	
	    	Instant start=Instant.now();
	    	logger.info("method execution start");
	    	String music=null;
	    	if(vehiclestarted) {
	    		music=speakers.makeSound(song);
	    	}else {
	    		logger.log(Level.SEVERE,"vehicle are not perform operation");
	    	}
	    	logger.info("method execution end"); 
	    	Instant finish = Instant.now();
	    	long  timeElapsed = Duration.between(start, finish).toMillis();
			 logger.info("Time took to execute the method : "+timeElapsed);
			 
	        return speakers.makeSound(song);
	    }
	    
	    public String moveVehicle(boolean vehicleStarted){
	    	Instant start=Instant.now();
	    	logger.info("method execution start");
	    	
	    
	    	String status=null;
	    	if(vehicleStarted) {
	    		status=tyres.rotate();
	    	}else {
	    		logger.log(Level.SEVERE,"vehicle not started o perform the operation");
	    		
	    	}
	    	logger.info("method execution end");
	    	Instant finish=Instant.now();
	    	long timeElapsed=Duration.between(start,finish).toMillis();
	    	logger.info("Time took to execute the method :"+timeElapsed);
	    	
	    	return tyres.rotate();
	    	
	}
	    
	    public String applyBrake(boolean VehicleStarted,Song song) {
	    	Instant start=Instant.now();
	    	logger.info("apply brake method is executing");
	    	String status=null;
	    	if(VehicleStarted) {
	    		status=tyres.stop();
	    		
	    	}else {
	    		logger.log(Level.SEVERE,"Vehicle not started to perform the operation");
	    	}
	    	logger.info("method execution stopped");
	    	Instant finish=Instant.now();
	    	long timeElapsed=Duration.between(start, finish).toMillis();
	    	logger.info("time took to execute:::"+timeElapsed);
	    	return tyres.stop();
	    }
	   
	    public Speaker getSpeaker() {
	    	return speakers;
	    }
	    public void setSpeaker(	Speaker speakers) {
	    	this.speakers=speakers;
	    }
	    public Tyres getTyre() {
	    	return tyres;
	    }
	    public void getTyre(Tyres tyres) {
	    	this.tyres=tyres;
	    }
}