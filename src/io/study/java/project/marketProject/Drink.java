package io.study.java.project.marketProject;

public class Drink {
    private String drinkValue;
    private int drinkPrice;

    public Drink(String drinkValue, int drinkPrice){
        this.drinkValue = drinkValue;
        this.drinkPrice = drinkPrice;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public String getMeatValue() {
        return drinkValue;
    }
    public int totalMeatPrice(int num, int drinkPrice){
        int totaldrinkprice = num * drinkPrice;
        return totaldrinkprice;
    }
}
