package io.study.java.examples.old.chapter6.game;

import java.util.Scanner;

public class CharacterMain {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        CharacterMain characterMain = new CharacterMain();


        System.out.println("캐릭터 아이템을 설정 합니다.");
        System.out.println("1. 무기 설정");
        System.out.println("무기 이름을 입력 하시오.");
        String weaponName = sc.nextLine();
        System.out.println("무기 공격력을 입력 하세요.");
        int weaponAtkPoint = sc.nextInt();
        sc.nextLine();
        CharacterWeapon characterWeapon = new CharacterWeapon(weaponName, weaponAtkPoint);

        System.out.println("2. 방어구 설정");
        System.out.println("방어구 이름을 입력 하시오.");
        String defenceName = sc.nextLine();
        sc.nextLine();
        System.out.println("방어구 방어력을 입력 하시오.");
        int defenceDfPoint = sc.nextInt();
        sc.nextLine();
        CharacterDefence characterDefence = new CharacterDefence(defenceName, defenceDfPoint);

        System.out.println("3. 강화수치 설정");
        System.out.println("무기 강화수치를 입력하시오.(1강화당 공격력 20 증가)");
        int weaponUpgrade = sc.nextInt();
        characterWeapon.setWeaponUpgrade(weaponUpgrade);


        System.out.println("방어구 강화수치를 입력하시오.(1강화당 방어력 5 증가)");
        int defenceUpgrade = sc.nextInt();
        sc.nextLine();
        characterDefence.setDefenceUpgrade(defenceUpgrade);


        System.out.println("4. 캐릭터의 기본 스펙 설정");
        System.out.println("캐릭터 이름을 입력하시오.");
        String characterName = sc.nextLine();
        System.out.println("캐릭터의 기본 공격력을 입력 하시오.");
        int characterAtkPoint = sc.nextInt();
        System.out.println("캐릭터의 기본 방어력을 입력 하시오.");
        int characterDfPoint = sc.nextInt();

        Character character = new Character(characterName, characterAtkPoint, characterDfPoint);

        System.out.println("5.캐릭터 기본정보 증가");
        System.out.println("# 캐릭터 : " + character.getCharacterName());
        System.out.println("- 무기 : " + (character.getCharacterAtkPoint() + "+" + weaponUpgrade) + characterWeapon.getWeaponName());
        System.out.println("- 방어 : " + (character.getCharacterDfPoint() + "+" + defenceDfPoint) + characterDefence.getDefenceName());
        System.out.println("------------------------------------------");
        System.out.println("# 스탯");
        System.out.println("- 공격력  " + characterWeapon.getWpUpgrade() + ("  기본" + character.getCharacterAtkPoint() + "  무기" + (characterWeapon.getWeaponUpgrade() * 20)));
        System.out.println("- 방력 : " + characterDefence.getDfUpgrade() + ("  기본" + character.getCharacterDfPoint() + "  무기" + (characterDefence.getDefenceUpgrade() * 5)));


    }
}
