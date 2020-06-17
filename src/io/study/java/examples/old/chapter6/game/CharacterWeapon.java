package io.study.java.examples.old.chapter6.game;

public class CharacterWeapon {
    private String weaponName;
    private int weaponAtkPoint;
    private int weaponUpgrade;

    public CharacterWeapon(String weaponName, int weaponAtkPoint) {
        this.weaponName = weaponName;
        this.weaponAtkPoint = weaponAtkPoint;
    }

    public void setWeaponUpgrade(int weaponUpgrade) {
        this.weaponUpgrade = weaponUpgrade;
    }

    public String getWeaponName() {
        return this.weaponName;
    }

    public int getWeaponAtkPoint() {
        return this.weaponAtkPoint;
    }

    public int getWeaponUpgrade() {
        return this.weaponUpgrade;
    }

    public int getWpUpgrade(){
        return this.weaponAtkPoint + (this.weaponUpgrade*20);

    }

}
