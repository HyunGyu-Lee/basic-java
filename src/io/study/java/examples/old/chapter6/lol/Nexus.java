package io.study.java.examples.old.chapter6.lol;

public class Nexus {
    private int num;

    public Nexus() {
        this.num = 0;

    }

    public Minion minion() {
            int div;
            Minion minion = new Minion();
            num++;
            div = num%3;
            if (div==0) {
                minion.setNormal();
            }

            return minion;

    }

}

