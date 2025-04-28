package com.fmc.tyres;

import org.springframework.stereotype.Component;

@Component("bridge")  
public class BridgeStoneTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("BridgeStone tyres are rotating.");
    }
}
