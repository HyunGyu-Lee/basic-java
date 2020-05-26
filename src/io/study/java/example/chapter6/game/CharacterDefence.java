package io.study.java.example.chapter6.game;

public class CharacterDefence {
    private String defenceName;
    private int defenceDfpoint;
    private int defenceUpgrade;

    public CharacterDefence(String defenceName, int defenceDfpoint) {
        this.defenceName = defenceName;
        this.defenceDfpoint = defenceDfpoint;

    }

    public void setDefenceUpgrade(int defenceDfpoint) {
        this.defenceDfpoint = defenceDfpoint;

    }

    public String getDefenceName() {
        return defenceName;
    }

    public int getDefenceDfpoint() {
        return defenceDfpoint;
    }

    public int getDefenceUpgrade() {
        return defenceUpgrade;
    }

    public int getDfUpgrade() {
        return defenceDfpoint + (defenceUpgrade * 5);
    }


}
