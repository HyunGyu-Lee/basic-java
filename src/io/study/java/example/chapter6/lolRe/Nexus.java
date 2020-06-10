package io.study.java.example.chapter6.lolRe;

public class Nexus {

    private int madeMinion;

    public Minion minion() {
        Minion minion = new Minion();
        this.madeMinion = this.madeMinion + 1;

        if (this.madeMinion / 3 == 0) {

        } else {
            minion.superMinion();
        }

        return minion;
    }

}
