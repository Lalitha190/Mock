package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class Purchase {
	private String mobilename;
	
	private int cost=20000;
	
	public String getName() {
		return mobilename;
	}
	
	public void setMobile(String mobilename) {
		this.mobilename=mobilename;
	}

	@Override
	public String toString() {
		return "Purchase [mobile=" + mobilename + ", cost=" + cost + "]";
	}

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
