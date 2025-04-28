package com.Profileex.input;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("default")
public class QaService implements GenericService {
	@Value("${qa.info.nameoftheserver}")
	private String nameoftheserver;
	

	
	public QaService() {
		super();
	}



	public QaService(String nameoftheserver) {
		super();
		this.nameoftheserver = nameoftheserver;
	}



	public String getNameoftheserver() {
		return nameoftheserver;
	}



	public void setNameoftheserver(String nameoftheserver) {
		this.nameoftheserver = nameoftheserver;
	}



	


	@Override
	public String toString() {
		return "QaService [nameoftheserver=" + nameoftheserver + "]";
	}



	public void task() {
		System.out.println("The qa service is:"+nameoftheserver);
	}
	
	

}
