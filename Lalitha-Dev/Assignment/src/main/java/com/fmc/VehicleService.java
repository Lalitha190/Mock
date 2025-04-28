package com.fmc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fmc.speakers.Speaker;
import com.fmc.tyres.Tyres;

@Component
public class VehicleService {
	private Tyres tyres;
	private Speaker speaker;
	public VehicleService(@Qualifier("bridge")Tyres tyres,@Qualifier("BoseSpeaker")Speaker speaker) {
		this.tyres=tyres;
		this.speaker=speaker;
	}
	public void music() {
		speaker.makeSound();
	}
	public void move() {
		tyres.rotate();
	}
}
