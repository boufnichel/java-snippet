package org.devops.build.test.domain;

import java.util.List;

public class Product {

	private String name;
	private String code;
	private List<PriceRow> prices;
	
	public Product(String name, String code, List<PriceRow> prices) {
		super();
		this.name = name;
		this.code = code;
		this.prices = prices;
	}
	public List<PriceRow> getPrices() {
		return prices;
	}
	public void setPrices(List<PriceRow> prices) {
		this.prices = prices;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
