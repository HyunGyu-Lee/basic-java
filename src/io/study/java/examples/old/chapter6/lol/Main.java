package io.study.java.examples.old.chapter6.lol;

public class Main {

    public static void main(String[] args) {
        Nexus nexus = new Nexus();

        createMinion(nexus);

        Minion minion1 = nexus.minion();
        System.out.println(minion1.getAtkPoint());
        System.out.println(minion1.getHp());

        Minion minion2 = nexus.minion();
        System.out.println(minion2.getAtkPoint());
        System.out.println(minion2.getHp());

        Minion minion3 = nexus.minion();
        System.out.println(minion3.getAtkPoint());
        System.out.println(minion3.getHp());

        Minion minion4 = nexus.minion();
        System.out.println(minion4.getAtkPoint());
        System.out.println(minion4.getHp());

        Minion minion5 = nexus.minion();
        System.out.println(minion5.getAtkPoint());
        System.out.println(minion5.getHp());


    }

    public static void createMinion(Nexus nexus) {
        Minion minion = nexus.minion();
        System.out.println(minion.getAtkPoint());
        System.out.println(minion.getHp());

    }
}
