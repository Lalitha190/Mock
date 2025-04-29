package com.example.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class VehicleStarted {
	private Logger logger = Logger.getLogger(VehicleStarted.class.getName());
	@Before("execution(* com.example.all.*.*(..)) && args(vehicleStarted,..)")
	public void isVehicleStarted(JoinPoint joinpoint,boolean vehicleStarted)throws Throwable{
		
		if(!vehicleStarted) {
			throw new  RuntimeException("Vehicle not started");
		}
}

}
