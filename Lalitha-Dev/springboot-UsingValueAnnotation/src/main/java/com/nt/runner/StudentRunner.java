package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.nt.bindings.Student;

@Component
//@Order(1)
public class StudentRunner implements CommandLineRunner,Ordered {     
	
	@Autowired
	private Student stu;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		   System.out.println(stu);
		  // System.out.println(stu);
	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 6;
	}

}
