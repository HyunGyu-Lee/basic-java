package io.study.java.example.chapter6.rpgGame.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Character {
    private String characterName;
    private String characterJob;
    private Weapon characterWeapon;

    public Character(String characterName, String characterJob) {
        this.characterName = characterName;
        this.characterJob = characterJob;
    }

    public String getCharacterName() {

        return characterName;
    }

    public String getCharacterJob() {

        return characterJob;
    }

    public String getCharacterJobName() {
        String characterName = "";
        if (characterJob.equals("W")) {
            characterName = "전사";
        } else if (characterJob.equals("A")) {
            characterName = "궁수";
        } else if (characterJob.equals("M")) {
            characterName = "마법사";
        }
        return characterName;
    }

    public Weapon getCharacterWeapon() {

        return characterWeapon;
    }

    public void setCharacterWeapon(Weapon characterWeapon) {

        this.characterWeapon = characterWeapon;
    }
}
