package com.fmc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speaker {

	
	public String makeSound(Song song) {
		
		return "play the music "+ song.getTitle() + " by "+ song.getSingerName() +
				"with bose speakers ";
	}

	
		
	}

	


