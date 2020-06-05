package io.study.java.example.chapter6.lol;

public class Nexus {
    private int num;

    public Nexus() {
        this.num = 0;

    }

    public Minion minion() {
            Minion minion = new Minion();
            num++;
            if (num >= 3) {
                minion.setNormal();
            }

            return minion;

    }

}

