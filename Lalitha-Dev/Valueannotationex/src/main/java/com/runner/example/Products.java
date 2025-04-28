package com.runner.example;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Products implements CommandLineRunner {
	
	
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price  + ",product_brand=" + product_brand + "]";
	}


	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Value("${pro.info.product_id}")
	int product_id;
	
	
	@Value("${pro.info.product_name}")
	String product_name;
	
	@Value("${pro.info.product_price}")
	double product_price;
	
	
	
	/*
	 * @Value("#{${pro.info.product_code.code}}") Map<String,Integer>
	 * product_code.code;
	 */
	 
	 
	  
	 
	
	@Value("${pro.info.product_brand}")
	Set<String> product_brand;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	
	/*
	 * public Map<String, Integer> getProduct_code() { return product_code; }
	 * 
	 * public void setProduct_code(Map<String, Integer> product_code) {
	 * this.product_code = product_code; }
	 */
	 

	public Set<String> getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(Set<String> product_brand) {
		this.product_brand = product_brand;
	}

	public Products(int product_id, String product_name, double product_price, Map<String, Integer> product_code,
			Set<String> product_brand) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		//this.product_code = product_code;
		this.product_brand = product_brand;
	}

	
	

}
