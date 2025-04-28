package com.fmc;

import org.springframework.stereotype.Component;

@Component("epson")
public class Epson  implements Printer{
	public void PrintDocument(String document) {
		System.out.println(" Epson print document through Epson--"+document);
	}

	
	public void scanDocument(String document) {
		System.out.println(" Epson scandocument through the Epson--"+document);
	}

	
	public void faxDocument(String document) {
		System.out.println(" Epson faxdocument through the Epson--"+document);
	}


	
}
