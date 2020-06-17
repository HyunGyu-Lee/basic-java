/*
package io.study.java.example.chapter6.Calculator;


import java.util.Scanner;

/**
 * @author hyungyu.lee@nhn.com

public class CoffeeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CoffeePos pos = new CoffeePos(a, c, s);

		System.out.println("커피 머신을 설정합니다.");
		System.out.println("아메리카노 1잔 가격을 입력하세요.");
		int a = sc.nextInt();
		System.out.println("카페라떼 1잔 가격을 입력하세요.");
		int c = sc.nextInt();
		System.out.println("사이즈업 할 경우 가격 상승치를 입력하세요");
		int s = sc.nextInt();



		System.out.println("주문을 받습니다.");
		System.out.println("주문 형식은 '커피종류_사이즈업여부,잔수'로 입력합니다.");
		sc.nextLine();
		String orderString = sc.nextLine();

		Coffee[] coffees = pos.order(orderString);

		for (int i = 0; i < coffees.length; i++) {
			int price = coffees[i].getPrice();
			if (coffees[i].isSizeUp()) {
				price = price + pos.getSizeUpPrize();
			}
			System.out.println(String.format("%s%s, %d", coffees[i].getName(), coffees[i].isSizeUp() ? "(사이즈업)" : "", price));
		}
	}

}
*/