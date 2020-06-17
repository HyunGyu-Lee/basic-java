package io.study.java.examples.old.chapter6.rpgGame;

import java.util.Scanner;

public class RpgMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("캐릭터를 생성합니다.");
        System.out.println("캐릭터 이름을 입력 하세요.");
        String characterName = sc.nextLine();
        System.out.println("캐릭터 직업을 설정 하세요(W:전사 A:궁수 M:마법사)");
        String characterJob = sc.nextLine();
        Character character = new Character(characterName, characterJob);
        character.setCharacterWeapon();
        character.setCharacterJob();

        Weapon SD = new Weapon("SD");
        Weapon BW = new Weapon("BW");
        Weapon ST = new Weapon("ST");


        System.out.println(String.format("%s(%s)로 시뮬레이션을 시작합니다.", character.getCharacterName(), character.getCharacterJob()));
        character.setCharacterJob();

        while (true) {
            System.out.println("무기를 선택하여 주세요.(SD:검 BW:활, ST:스태프)");
            String weaponType = sc.nextLine();
            Weapon weapon = new Weapon(weaponType);
            weapon.setWeaponType();

            if (character.getCharacterJob().equals("전사")) {
                if (weaponType.equals(SD.getWeaponType())) {
                    System.out.println(String.format("%s(%s)가 (%s)를 장착하였습니다.", character.getCharacterName(), character.getCharacterJob(), weapon.getWeaponType()));
                    break;
                } else {
                    System.out.println(String.format("%s는 %s를 장착할 수 없습니다.", character.getCharacterJob(), weapon.getWeaponType()));
                }
            }
            if (character.getCharacterJob().equals("궁수")) {
                if (weaponType.equals(BW.getWeaponType())) {
                    System.out.println(String.format("%s(%s)가 (%s)를 장착하였습니다.", character.getCharacterName(), character.getCharacterJob(), weapon.getWeaponType()));
                    break;
                } else {
                    System.out.println(String.format("%s는 %s를 장착할 수 없습니다.", character.getCharacterJob(), weapon.getWeaponType()));
                }
            }
            if (character.getCharacterJob().equals("마법사")) {
                if (weaponType.equals(ST.getWeaponType())) {
                    System.out.println(String.format("%s(%s)가 (%s)를 장착하였습니다.", character.getCharacterName(), character.getCharacterJob(), weapon.getWeaponType()));
                    break;
                } else {
                    System.out.println(String.format("%s는 %s를 장착할 수 없습니다.", character.getCharacterJob(), weapon.getWeaponType()));
                }
            }


        }
    }
}
