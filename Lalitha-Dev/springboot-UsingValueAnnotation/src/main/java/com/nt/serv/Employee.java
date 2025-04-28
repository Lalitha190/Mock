package com.nt.serv;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("emp.info")
@Component
public class Employee {
	
	
	int id;
	String name;
	String designation;
	List<String> surnames;
	Map<String,Integer> address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<String> getSurnames() {
		return surnames;
	}
	public void setSurnames(List<String> surnames) {
		this.surnames = surnames;
	}
	public Map<String, Integer> getAddress() {
		return address;
	}
	public void setAddress(Map<String, Integer> address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", surnames=" + surnames
				+ ", address=" + address + "]";
	}
	
}
