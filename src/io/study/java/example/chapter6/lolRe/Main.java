package io.study.java.example.chapter6.lolRe;

public class Main {
    public static void main(String[] args) {
        Nexus nexus = new Nexus();

        show(nexus);


        Minion minion1 = nexus.minion();
        System.out.println(minion1.getHp());
        System.out.println(minion1.getAtkPoint());

        Minion minion2 = nexus.minion();
        System.out.println(minion2.getHp());
        System.out.println(minion2.getAtkPoint());

        Minion minion3 = nexus.minion();
        System.out.println(minion3.getHp());
        System.out.println(minion3.getAtkPoint());

        Minion minion4 = nexus.minion();
        System.out.println(minion4.getHp());
        System.out.println(minion4.getAtkPoint());

        Minion minion5 = nexus.minion();
        System.out.println(minion5.getHp());
        System.out.println(minion5.getAtkPoint());

        Minion minion6 = nexus.minion();
        System.out.println(minion6.getHp());
        System.out.println(minion6.getAtkPoint());

    }

    public static void show(Nexus nexus) {
        Minion minion = nexus.minion();
        System.out.println(minion.getHp());
        System.out.println(minion.getAtkPoint());

    }
}
