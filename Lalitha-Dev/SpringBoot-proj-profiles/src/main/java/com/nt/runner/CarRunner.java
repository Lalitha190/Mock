package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.CarTypes;

@Component
public class CarRunner implements CommandLineRunner {

	@Autowired
	private CarTypes types;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		types.carPrice();
		types.start();
		types.stop();
	}

}
