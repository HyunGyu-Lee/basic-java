package io.study.java.project.marketProject;

public class Fish {
    private String fishValue;
    private int fishPrice;

    public Fish(String fishValue, int fishPrice){
        this.fishValue = fishValue;
        this.fishPrice = fishPrice;
    }

    public int getFishPrice() {
        return fishPrice;
    }

    public String getFishValueValue() {
        return fishValue;
    }

    public int totalFishPrice(int num, int fishPrice){
        int totalFishprice = num * fishPrice;
        return totalFishprice;
    }
}
