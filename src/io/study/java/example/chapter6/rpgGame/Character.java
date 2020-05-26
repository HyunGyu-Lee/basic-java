package io.study.java.example.chapter6.rpgGame;

public class Character {
    private String characterName;
    private String characterJob;
    private String characterWeapon;

    public Character(String characterName, String characterJob) {
        this.characterName = characterName;
        this.characterJob = characterJob;
    }


    public String getCharacterName(){
        return characterName;
    }

    public String getCharacterJob(){
        if(characterJob.equals("W")){
            characterJob = "전사";
        }else if(characterJob.equals("A")){
            characterJob = "궁수";
        }else if(characterJob.equals("M")){
            characterJob = "마법사";
        }
        return characterJob;
    }

    public void setCharacterWeapon(){
        this.characterWeapon = characterWeapon;

        if(characterJob.equals("전사")){
            characterWeapon = "검";
        } else if (characterJob.equals("궁수")) {
            characterWeapon = "활";
        } else if (characterJob.equals("마법사")) {
            characterWeapon = "스태프";
        }
    }

    public void setCharacterJob(){



    }


}
