package io.study.java.example.chapter6.lolRe;

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

    public void superMinion() {
        this.hp = this.hp * 2;
        this.atkPoint = this.atkPoint * 2;
    }


}
