package io.study.java.examples.old.chapter6.game.reCheck;

public class Character {
    private String characterName;
    private int characterAtk;
    private int characterDef;

    public Character(String characterName, int characterAtk, int characterDef){
        this.characterName = characterName;
        this.characterAtk = characterAtk;
        this.characterDef = characterDef;

    }

    public String getCharacterName(){
        return characterName;
    }

    public int getCharacterAtk(){
        return characterAtk;
    }

    public int getCharacterDef(){
        return characterDef;
    }





}
