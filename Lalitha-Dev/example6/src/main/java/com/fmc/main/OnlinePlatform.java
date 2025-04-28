package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Amazon;
import com.fmc.config.ProjectConfig;

import io.micrometer.observation.Observation.Context;

public class OnlinePlatform {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Amazon a=context.getBean(Amazon.class);
		
		System.out.println("This is from amazon class:"+a.getName());
		System.out.println(a);
		
	}

}
