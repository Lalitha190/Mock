package com.Profileex.input;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Order(2)
@Profile("dev")
public class DevService implements GenericService{
	
	
	@Value("${dev.info.nameofserver}")
	private String nameofserver;
	
	public DevService() {
		
	}
	public DevService(String nameofserver) {
		this.nameofserver=nameofserver;
	}
	public String getNameOfServer() {
		return nameofserver;
	}
	
	
	@Override
	public String toString() {
		return "DevService [nameofserver=" + nameofserver + "]";
	}
	@Override
	public void task() {
		System.out.println("This is from Devservice----");
		System.out.println("nameofserver="+nameofserver);
		
	}
	


}
