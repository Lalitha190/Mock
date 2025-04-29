package com.example.all;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    
    public String rotate() {
         return "BridgeStone tyres are rotating.";
    }

	@Override
	public String stop() {
		return "BridgeStoneTyres are stopped";
	}
}