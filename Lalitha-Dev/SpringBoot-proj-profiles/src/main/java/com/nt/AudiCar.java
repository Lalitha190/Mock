package com.nt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("audicar")
public class AudiCar implements CarTypes {
	
	

	@Override
	public void start() {
		System.out.println("Audi is about to start ");
		
	}

	@Override
	public String toString() {
		return "AudiCar []";
	}

	@Override
	public void stop() {
		System.out.println("Audi car stopped");
		
	}

	@Override
	public void carPrice() {
		System.out.println("Its cost is more because of its features");
	}

	
}
