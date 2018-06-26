package org.devops.build.test.domain;

public final class Currency {
	
	private String isocode;
	private String symbol;
	
	public Currency(String isocode, String symbol) {
		super();
		this.isocode = isocode;
		this.symbol = symbol;
	}
	
	public String getIsocode() {
		return isocode;
	}
	public void setIsocode(String isocode) {
		this.isocode = isocode;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	

}
