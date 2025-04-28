package com.fmc.aspect;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Component
@Order
public class LogAspect {
	private Logger logger=Logger.getLogger(LogAspect.class.getName());
	@Around("execution(* com.fmc.service.*.*(..))")
	public void printLogger(ProceedingJoinPoint  proceedingJoinPoint) throws Throwable {
		logger.info(proceedingJoinPoint.getSignature().toString()+"method execution start");
		Instant start=Instant.now();
		logger.info("method execution start");
		proceedingJoinPoint.proceed();
		
		Instant finish=Instant.now();
		long timeElapsed=Duration.between(start, finish).toMillis();
		logger.info("Time taken to execute the method:"+timeElapsed);
		
	
}
	@AfterThrowing(value="execution(* com.fmc.service.*.*(..))",throwing="ex")
	public void logException(JoinPoint joinpoint, Exception ex) {
			logger.log(Level.SEVERE,joinpoint.getSignature()+"An excepion thrown with the help "
					+ "@AfterThrowing which happend due to: "+ex.getMessage());
			
}
	
	@AfterReturning(value="execution(* com.fmc.service .*.*(..))",returning="retvalue")
	public void logStatus(JoinPoint joinpoint,Object retvalue) {
	    String methodSignature = joinpoint.getSignature().toString();

	    String returnValMessage = (retvalue != null)
	            ? "with the help of " + retvalue.toString()
	            : "with no return value (void or null)";

	        logger.log(Level.INFO, methodSignature +
	            " Method successfully executed " + returnValMessage);
	    }
		
	}
