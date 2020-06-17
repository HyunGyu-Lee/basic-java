package com.hst.learninghub.coffeeshop;

/**
 * @author hyungyu.lee@nhn.com
 */
public class Coffee {
	private String name;
	private int price;
	private boolean sizeUp;

	public Coffee(String name, int price, boolean sizeUp) {
		this.name = name;
		this.price = price;
		this.sizeUp = sizeUp;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public boolean isSizeUp() {
		return sizeUp;
	}
}
