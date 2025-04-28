package com.fmc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker {

    @Override
    public String makeSound(Song song) {
        System.out.println("Sony speakers with good music system");
        return "Playing the song" +song.getTitle()+ "by"+song.getSingerName()+
        		" by with sony speakers";
    }

	
}
