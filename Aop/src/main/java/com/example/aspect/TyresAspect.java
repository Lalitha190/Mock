package com.example.aspect;

import java.awt.Dimension;
import java.time.Instant;
import java.util.Dictionary;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@EnableAspectJAutoProxy

public class TyresAspect {
	
	private Logger logger = Logger.getLogger(TyresAspect.class.getName());
	
	@After("execution(* com.example.all.MichelinTyres.*(..)")
	public String rotate(JoinPoint joinpoint){ 
		Instant start=Instant.now();
		logger.info("method execution started");
		Instant end=Instant.now();
		 long timeelapsed=Dimension.Between(start,end).toMillis();
		 logger.info("method execution stopped")
		
        return "Vehicle moving with the help of BridgeStone tyres"; 

    } 
}
