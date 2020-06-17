package io.study.java.examples.old.chapter6.game.reCheck;

import java.util.Scanner;

public class CharacterMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("캐릭터 아이템을 설정 합니다.");
        System.out.println("1. 무기 설정");
        System.out.println("무기 이름을 입력 하세요.");
        String weaponName = sc.nextLine();
        System.out.println("무기 공격력을 입력 하세요.");
        int weaponAtk = sc.nextInt();
        System.out.println("2.방어구 설정");
        System.out.println("방어구 이름을 입력 하세요.");
        String defenceName = sc.nextLine();
        System.out.println("방어구 방어력을 입력 하세요.");
        int defenceDef = sc.nextInt();
        sc.nextLine();

        System.out.println("3. 강화 수치 설정");
        System.out.println("무기 강화 수치를 입력 하세요.");
        int weaponAtkPoint = sc.nextInt();
        System.out.println("방어구 강화 수치를 입력 하세요.");
        int defenceDefPoint = sc.nextInt();

        System.out.println("4. 캐릭터 정보 설정");
        System.out.println("캐릭터 이름을 입력 하세요.");
        String characterName = sc.nextLine();
        System.out.println("캐릭터 기본 공격력을 입력 하세요.");
        int characterAtk = sc.nextInt();
        System.out.println("캐릭터 기본 방어력을 입력하세요.");
        int characterDef = sc.nextInt();

        Character character = new Character(characterName, characterAtk, characterDef);
        CharacterWeapon characterWeapon = new CharacterWeapon(weaponName,weaponAtk);
        CharacterDefence characterDefence = new CharacterDefence(defenceName,defenceDef);

        System.out.println(String.format("캐릭터 : %s",character.getCharacterName()));
        System.out.println(String.format("무기 : + %s , %s",characterWeapon.getWeaponAtkPoint(),characterWeapon.getWeaponName()));
        System.out.println(String.format("방어구 : + %s, %s",characterDefence.getDefenceDefPoint(),characterDefence.getDefenceName()));

        System.out.println("# 스탯");
        System.out.println(String.format("공격력: %s (기본 : %s , 공격력 : %s",(characterWeapon.getWeaponAtk()+characterWeapon.setWeaponAtkPoint(weaponAtkPoint)),character.getCharacterAtk(),characterWeapon.setWeaponAtkPoint(weaponAtkPoint)));



    }
}
