package io.study.java.examples.old.chapter6.coffeeRe;

/**
 * @author dlgusrb0808@gmail.com
 */
public class CoffeeMachineV2 {
	private int a;
	private int b;
	private int c;

	public CoffeeMachineV2() {
		this.a = 10;
		this.b = 10;
		this.c = 10;
	}

	// 커피를 만들어주는 메소드
	// 메소드 형식 : 접근제한자 반환형 메소드명(인자 = 매개변수 = 파라미터 = 아규먼트)
	// 인자 = 반환될 값 만들때 필요한 것
	// 메소드명 = 기능에 대한 이름
	// 반환형 = 무엇이 반환 되어야 할지의 타입

	public Coffee makeCoffee(String coffeeMenu, int shot, int water) {
		Coffee coffee = new Coffee(coffeeMenu, shot, water);

		useMaterial(coffee);

		return coffee;
	}

	public void useMaterial(Coffee coffee) {
		switch (coffee.getCoffeeMenu()) {
			case "A":
				a = a - 1; break;
			case "B":
				b = b - 1; break;
			case "C":
				c = c - 1; break;
		}
	}
}
