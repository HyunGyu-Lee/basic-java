package io.study.java.example.chapter6.rpgGame.feedback;

import java.util.Scanner;

/**
 * @author dlgusrb0808@gmail.com
 */
public class RpgMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("캐릭터를 생성합니다.");
		System.out.println("캐릭터 이름을 입력 하세요.");
		String characterName = sc.nextLine();
		System.out.println("캐릭터 직업을 설정 하세요(W:전사 A:궁수 M:마법사)");
		String characterJob = sc.nextLine(); 
		Character character = new Character(characterName, characterJob);

		Weapon SD = new Weapon("SD");
		Weapon BW = new Weapon("BW");
		Weapon ST = new Weapon("ST");


		System.out.println(String.format("%s(%s)로 시뮬레이션을 시작합니다.", character.getCharacterName(),
				character.getCharacterJobName()));

		while (true) {
			System.out.println("무기를 선택하여 주세요.(SD:검 BW:활, ST:스태프)");
			String weaponType = sc.nextLine();

			if (character.getCharacterJob().equals("W")) {
				if (weaponType.equals(SD.getWeaponType())) {
					character.setCharacterWeapon(SD);
					break;
				} else {
					System.out.println(String.format("%s는 %s를 장착할 수 없습니다.", character.getCharacterJobName(), SD.getWeaponName()));
				}
			}
			if (character.getCharacterJob().equals("A")) {
				if (weaponType.equals(BW.getWeaponType())) {
					character.setCharacterWeapon(BW);
					break;
				} else {
					System.out.println(String.format("%s는 %s를 장착할 수 없습니다.", character.getCharacterJobName(), BW.getWeaponName()));
				}
			}
			if (character.getCharacterJob().equals("M")) {
				if (weaponType.equals(ST.getWeaponType())) {
					character.setCharacterWeapon(ST);
					break;
				} else {
					System.out.println(String.format("%s는 %s를 장착할 수 없습니다.", character.getCharacterJobName(), ST.getWeaponName()));
				}
			}
		}


		System.out.println(String.format("%s(%s)가 (%s)를 장착하였습니다.",
				character.getCharacterName(), character.getCharacterJobName(), character.getCharacterWeapon().getWeaponName()));
	}

}
