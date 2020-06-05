package io.study.java.example.chapter6.coffeeRe;

public class Coffee {

    private String coffeeMenu;
    private int shot;
    private int water;

    public Coffee(String coffeeMenu, int shot, int water){
        this.coffeeMenu = coffeeMenu;
        this.shot = shot;
        this.water = water;
    }

    public String getCoffeeMenu(){return coffeeMenu;}
    public int getShot(){return shot;}
    public int getWater(){return water;}



    }




