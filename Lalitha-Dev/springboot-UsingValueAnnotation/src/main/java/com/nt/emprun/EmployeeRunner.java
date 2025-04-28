package com.nt.emprun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.nt.serv.Employee;


@Component
@Order(2)
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private Employee emp;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		   System.out.println(emp);
		  // System.out.println(stu);
	}
}
