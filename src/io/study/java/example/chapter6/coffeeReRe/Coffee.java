package io.study.java.example.chapter6.coffeeReRe;

public class Coffee {

    private String coffeeType;
    private int shot;
    private int water;

    public Coffee(String coffeeType, int shot, int water){
        this.coffeeType = coffeeType;
        this.shot = shot;
        this.water = water;
    }

    public String getCoffeeType(){
        return coffeeType;
    }
    public int getShot(){
        return shot;
    }
    public int getWater(){
        return water;
    }



}
