package io.study.java.example.chapter6.rpgGame;

public class Weapon {

    private String weaponType;

    public Weapon (String weaponType){
        this.weaponType = weaponType;
    }

    public String getWeaponType(){
        if(weaponType.equals("SD")){
            this.weaponType = "검";
        }else if(weaponType.equals("BW")){
            weaponType = "활";
        }else if(weaponType.equals("ST")){
            weaponType = "스태프";
        }
        return weaponType;

    }

    public void setWeaponType(){

    }


}
