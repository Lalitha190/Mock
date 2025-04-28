package com.fmc;

import org.springframework.stereotype.Component;

@Component("hp")
public class Hp  implements Printer{

	
	public void PrintDocument(String document) {
		System.out.println(" Hp print document through print--"+document);
	}


	public void scanDocument(String document) {
		System.out.println(" Hp scandocument through the print--"+document);
	}

	
	public void faxDocument(String document) {
		System.out.println(" Hp faxdocument through the print--"+document);
	}

}
