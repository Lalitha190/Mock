package com.fmc;

import org.springframework.stereotype.Component;

@Component("canon")
public class Canon  implements Printer{
	@Override
	public void PrintDocument(String document) {
		System.out.println("print document through canon--"+document);
	}

	@Override
	public void scanDocument(String document) {
		System.out.println("scandocument through the canon--"+document);
	}

	@Override
	public void faxDocument(String document) {
		System.out.println("faxdocument through the canon--"+document);
	}
}
