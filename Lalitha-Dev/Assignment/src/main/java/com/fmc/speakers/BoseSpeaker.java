package com.fmc.speakers;

import org.springframework.stereotype.Component;

@Component("BoseSpeaker")
public class BoseSpeaker implements Speaker {

	public void makeSound() {
		System.out.println("Bose speakers");
		
	}

}
