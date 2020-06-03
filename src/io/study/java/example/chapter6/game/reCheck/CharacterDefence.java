package io.study.java.example.chapter6.game.reCheck;

public class CharacterDefence {
    private String defenceName;
    private int defenceDef;
    private int defenceDefPoint;

    public CharacterDefence(String defenceName, int defenceDef){
        this.defenceName = defenceName;
        this.defenceDef = defenceDef;
    }

    public int setDefenceDefPoint(int defenceDefPoint){
        this.defenceDefPoint = defenceDefPoint;
        this.defenceDefPoint = this.defenceDefPoint*5;
        return defenceDefPoint;
    }

    public String getDefenceName(){
        return defenceName;
    }
    public int getDefenceDef(){
        return defenceDef;
    }
    public int getDefenceDefPoint(){
        return defenceDefPoint;
    }
}
