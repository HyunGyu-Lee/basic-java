package io.study.java.example.chapter6.lol;

public class Nexus {
    private int num;
    private int div;

    public Nexus() {
        this.num = 0;

    }

    public Minion minion() {
            Minion minion = new Minion();
            num++;
            div = num%3;
            if (div==0) {
                minion.setNormal();
            }

            return minion;

    }

}

