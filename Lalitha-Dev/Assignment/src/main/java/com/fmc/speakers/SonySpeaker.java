package com.fmc.speakers;

import org.springframework.stereotype.Component;

@Component("sony")  
public class SonySpeaker implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Sony speakers with good music system");
    }
}
