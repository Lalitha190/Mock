package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Canon;
import com.fmc.Epson;
import com.fmc.Hp;
import com.fmc.OfficaSystem;
import com.fmc.Printer;
import com.fmc.config.AppConfig;


public class AppMain {
public static void main(String[] args) {
	 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	 OfficaSystem  office=context.getBean(OfficaSystem.class);
		 
		
		office.proceess();
		 
}
}
		
		
		
