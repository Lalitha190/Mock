package com.fmc.tyres;

import org.springframework.stereotype.Component;

@Component("MichelinTyres")
public class MichelinTyres  implements Tyres{
	public void rotate() {
		System.out.println("Michelin tyres are working properly");
	}
}
