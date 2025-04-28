package com.nt.bindings;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {

	@Value("${stu.info.id}")
	Integer id;
	
	@Value("${stu.info.name}")
	String name;
	
	@Value("${stu.info.designation}")
	String designation;
	
	@Value("${stu.info.surname}")
	List<String> surnames;
	
	/*
	 * 
	 * @Value("#{${stu.info.empaddress}}") Map<String,String> empaddress;
	 */
	 

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", designation=" + designation + ", surnames=" + surnames +"]";
	}
	
}
