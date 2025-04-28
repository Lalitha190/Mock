package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.inter.StudentImp;
import com.example.stu.Student;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
private StudentImp student;
	@Override
	public void run(String... args) throws Exception {
		student.save(new Student("Komala",70));
		student.save(new Student("Sanvi",67));
		student.save(new Student("Renu",80));

	}
}