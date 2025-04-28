package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fmc.Student;

class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		 Student stu=context.getBean(Student.class);
		 System.out.println("student name from spring context is:"+stu.getName());
		 System.out.println("student address from spring context is:"+stu.getAddress());
			
		
	}

}
