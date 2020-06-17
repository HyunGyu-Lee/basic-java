package io.study.java.examples.static_example.minion;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Minion {
	private static int timeWeight = 1;

	private int hp;
	private int atk;

	public Minion() {
		this.hp = 100 * timeWeight;
		this.atk = 10 * timeWeight;
	}

	public static void increaseTimeWeight() {
		timeWeight = timeWeight + 1;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public void hit() {
		this.hp = this.hp - 10;
	}

	public static int getTimeWeight() {
		return timeWeight;
	}
}
