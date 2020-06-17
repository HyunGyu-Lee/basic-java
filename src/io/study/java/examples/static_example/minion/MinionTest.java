package io.study.java.examples.static_example.minion;

import io.study.java.examples.static_example.minion.Minion;

/**
 * @author dlgusrb0808@gmail.com
 */
public class MinionTest {

	public static void main(String[] args) {
		Minion minion1 = new Minion();

		System.out.println(String.format("Minion 클래스의 시간 가중치 : %d", Minion.getTimeWeight()));
		System.out.println(String.format("minion1의 체력 / 공격력: %d / %d", minion1.getHp(), minion1.getAtk()));

		// 미니언이 1대 쳐맞은 상황 재현
		System.out.println("minion1이 한대 쳐맞음");
		minion1.hit();

		System.out.println(String.format("minion1의 시간 가중치 : %d", Minion.getTimeWeight()));
		System.out.println(String.format("minion1의 체력 / 공격력: %d / %d", minion1.getHp(), minion1.getAtk()));

		System.out.println("시간이 흘러 시간 가중치 증가시킴");
		Minion.increaseTimeWeight();

		Minion minion2 = new Minion();

		System.out.println(String.format("Minion 클래스의 시간 가중치 : %d", Minion.getTimeWeight()));
		System.out.println(String.format("minion2의 체력 / 공격력: %d / %d", minion2.getHp(), minion2.getAtk()));
	}

}
