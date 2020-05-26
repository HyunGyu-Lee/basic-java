package io.study.java.example.chapter6.rpgGame;

import java.util.Scanner;

public class RpgMain {

    public static void main(String[] args) {
        String sd;
        String bw;
        String st;


        Scanner sc = new Scanner(System.in);

        System.out.println("캐릭터를 생성합니다.");
        System.out.println("캐릭터 이름을 입력 하세요.");
        String characterName = sc.nextLine();
        System.out.println("캐릭터 직업을 설정 하세요(W:전사 A:궁수 M:마법사)");
        String characterJob = sc.nextLine();
        Character character = new Character(characterName, characterJob);
        character.setCharacterWeapon();
        System.out.println(String.format("%s(%s)로 시뮬레이션을 시작합니다.",character.getCharacterName(),character.getCharacterJob()));
        while(true){
            System.out.println("무기를 선택하여 주세요.(SD:검 BW:활, ST:스태프)");
            String weaponType = sc.nextLine();
            Weapon weapon = new Weapon(weaponType);
            break;

        }






    }
}
