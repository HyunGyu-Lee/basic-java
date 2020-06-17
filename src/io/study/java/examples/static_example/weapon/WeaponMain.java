package io.study.java.examples.static_example.weapon;

public class WeaponMain {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(100,1);

        System.out.println(String.format("무기의 공격력은 : %d , 강화수치는 : %d",weapon.getAtkPoint(),weapon.getUpgragePoint()));
        System.out.println(String.format("무기 각인 수치는 : %d",Weapon.getCarvePoint()));
        System.out.println(String.format("총 공격력은 : %d",weapon.weaponAtkUpgrade()));

        Weapon.upgradeCarvePoint();

        Weapon weapon1 = new Weapon(100,1);
        System.out.println(String.format("무기의 공격력은 : %d , 강화수치는 : %d",weapon1.getAtkPoint(),weapon1.getUpgragePoint()));
        System.out.println(String.format("무기 각인 수치는 : %d",Weapon.getCarvePoint()));
        System.out.println(String.format("총 공격력은 : %d",weapon1.weaponAtkUpgrade()));


    }


}
