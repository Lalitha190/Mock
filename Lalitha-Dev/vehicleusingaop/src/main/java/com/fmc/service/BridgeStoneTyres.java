package com.fmc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
         return "BridgeStone tyres are rotating.";
    }

	@Override
	public String stop() {
		return "BridgeStoneTyres are stopped";
	}
}
