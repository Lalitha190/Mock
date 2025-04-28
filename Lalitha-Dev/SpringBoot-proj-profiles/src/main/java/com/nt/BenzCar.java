package com.nt;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("BenzCar")
public class BenzCar  implements CarTypes{
	int carcost=20000;
	@Override
	public void start() {
		System.out.println("Benz car is started");
		
	}

	@Override
	public void stop() {
		System.out.println("Benz stopped");
		
	}

	@Override
	public void carPrice() {
		System.out.println("benz car cost is :"+carcost);
	}

}
