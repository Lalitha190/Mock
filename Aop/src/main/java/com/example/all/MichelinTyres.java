package com.example.all;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres  implements Tyres{
	public String rotate() {
		return "Michelin tyres are working properly";
	}

	@Override
	public String stop() {
		return "MichelinTyres are stopped";
	}
}