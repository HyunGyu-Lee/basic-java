package io.study.java.examples.static_example.weapon;

public class Weapon {
    private int atkPoint;
    private int upgragePoint;
    private static int carvePoint = 1;

    public Weapon(int atkPoint, int upgragePoint) {
        this.atkPoint = atkPoint;
        this.upgragePoint = upgragePoint;
    }

    public int getAtkPoint() {
        return atkPoint;
    }

    public int getUpgragePoint() {
        return upgragePoint;
    }

    public int weaponAtkUpgrade() {
        this.atkPoint = atkPoint + ((upgragePoint + carvePoint) * 10);
        return atkPoint;
    }

    public static void upgradeCarvePoint() {
        carvePoint = carvePoint + 1;
    }

    public static int getCarvePoint(){return carvePoint;}


}
