package io.study.java.examples.old.chapter6.rpgGame.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Weapon {
	private String weaponType;

	public Weapon(String weaponType) {

		this.weaponType = weaponType;
	}

	public String getWeaponType() {

		return weaponType;
	}

	public String getWeaponName() {

		String weaponName = "";
		if (weaponType.equals("SD")) {
			weaponName = "검";
		} else if (weaponType.equals("BW")) {
			weaponName = "활";
		} else if (weaponType.equals("ST")) {
			weaponName = "스태프";
		}
		return weaponName;
	}
}
