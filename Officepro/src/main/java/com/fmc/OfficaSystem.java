package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OfficaSystem {

	private Printer printer;
	
	@Autowired
	public OfficaSystem(@Qualifier("epson")Printer printer) {
		super();
		this.printer = printer;
	}


	public void proceess() {
		printer.PrintDocument("printed");
		printer. scanDocument("scanned");
		printer. faxDocument("faxed the document");
	}
	



	public void setPrinter(Printer printer) {
		this.printer = printer;
	}


	@Override
	public String toString() {
		return "OfficaSystem [printer=" + printer + "]";
	}


	
	
}
