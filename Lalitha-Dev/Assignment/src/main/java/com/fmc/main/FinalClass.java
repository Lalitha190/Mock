
package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Person;
import com.fmc.config.AssignmentConfig;


class FinalClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AssignmentConfig.class);
		Person p=context.getBean(Person.class);
		System.out.println("This is from amazon class");
		p.use();
	}

}
