package org.devops.build.test.domain;

public class PriceRow {
	
	private Double value;
	private boolean net;
	private Currency currency;
	
	public PriceRow(Double value, boolean net, Currency currency) {
		super();
		this.value = value;
		this.net = net;
		this.currency = currency;
	}
	
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public boolean isNet() {
		return net;
	}
	public void setNet(boolean net) {
		this.net = net;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	
	

}
