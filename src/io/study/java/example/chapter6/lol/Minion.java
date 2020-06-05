package io.study.java.example.chapter6.lol;

public class Minion {
    private int hp;
    private int atkPoint;

    public Minion() {
        this.hp = 100;
        this.atkPoint = 20;
    }

    public int getHp() {
        return hp;
    }

    public int getAtkPoint() {
        return atkPoint;
    }

    public void setNormal(){
        hp = hp *2;
        atkPoint = atkPoint *2;
    }

}
