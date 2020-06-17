package io.study.java.examples.old.chapter6.game.reCheck;

public class CharacterWeapon {
    private String weaponName;
    private int weaponAtk;
    private int weaponAtkPoint;

    public CharacterWeapon(String weaponName, int weaponAtk) {
        this.weaponName = weaponName;
        this.weaponAtk = weaponAtk;
    }


    public int setWeaponAtkPoint(int weaponAtkPoint) {
        this.weaponAtkPoint = weaponAtkPoint;

        this.weaponAtkPoint =  this.weaponAtkPoint * 10;

        return weaponAtkPoint;
    }


    public String getWeaponName() {
        return weaponName;
    }

    public int getWeaponAtk() {
        return weaponAtk;
    }

    public int getWeaponAtkPoint() {
        return weaponAtkPoint;
    }


}
