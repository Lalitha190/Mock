package com.nt;

import org.springframework.context.annotation.Profile;

import org.springframework.stereotype.Component;



@Component
@Profile("default")
public class KiaCar implements CarTypes{

	@Override
	public void start() {
		System.out.println("Kia started ");
	}

	@Override
	public void stop() {
		System.out.println("Kia stopped ");
	}

	@Override
	public void carPrice() {
		System.out.println("car price is : 10L");
	}

	

}
