/*
package io.study.java.example.chapter6.Calculator;


public class CoffeePos {
	private int americanoPrice;
	private int cafelattePrice;
	private int sizeUpPrize;

	public CoffeePos(int americanoPrice, int cafelattePrice, int sizeUpPrize) {
		this.americanoPrice = americanoPrice;
		this.cafelattePrice = cafelattePrice;
		this.sizeUpPrize = sizeUpPrize;
	}

	public CoffeePos[] order(String orderString) {
		// A_Y,5
		String[] orders = orderString.split("_");
		String[] orders2 = orders[1].split(",");

		String coffeeType = orders[0];
		String sizeUp = orders2[0];
		int count = Integer.parseInt(orders2[1]);

		Coffee[] coffees = new Coffee[count];
		for (int i = 0; i < count; i++) {
			int price = 0;
			String name = "";
			if (coffeeType.equals("A")) {
				name = "아메리카노";
				price = this.americanoPrice;
			} else if(coffeeType.equals("C")) {
				name = "카페라떼";
				price = this.cafelattePrice;
			}

			boolean isSizeUp;
			if (sizeUp.equals("Y")) {
				isSizeUp = true;
			} else {
				isSizeUp = false;
			}


			coffees[i] = new Coffee(name, price, isSizeUp);
		}

		return coffees;
	}

	public int getSizeUpPrize() {
		return sizeUpPrize;
	}
}
*/