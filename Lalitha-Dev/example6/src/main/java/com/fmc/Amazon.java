package com.fmc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Amazon {
	
	private String name="Dmart";
	 
	private int cost;
	
	private Purchase purchase;
	
	public Amazon(@Qualifier("product1") Purchase product1) {
		System.out.println("Bean is ready for this");
		this.purchase=purchase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name =name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Amazon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Amazon [name=" + name + ", cost=" + cost + ", purchase=" + purchase + "]";
	}	
}
