package io.study.java.chapter5;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("0 ~ 10까지의 수를 입력하시오.");

		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		int i = Integer.parseInt(userInput);

		if (i >= 0 && i <= 10) {
			System.out.println("0 ~ 10 사이입니다.");
		} else {
			System.out.println("0 ~ 10 사이가 아닙니다");
		}
	}

}
