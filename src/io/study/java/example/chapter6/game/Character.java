package io.study.java.example.chapter6.game;

public class Character {
    private String characterName;
    private int characterAtkPoint;
    private int characterDfPoint;

    public Character(String characterName, int characterAtkPoint, int characterDpPoint) {
        this.characterName = characterName;
        this.characterAtkPoint = characterAtkPoint;
        this.characterDfPoint = characterDpPoint;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public int getCharacterAtkPoint() {
        return this.characterAtkPoint;
    }

    public int getCharacterDfPoint() {
        return this.characterDfPoint;
    }


}
