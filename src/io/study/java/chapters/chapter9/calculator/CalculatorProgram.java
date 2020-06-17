package io.study.java.chapters.chapter9.calculator;

import java.util.Scanner;

/**
 * @author hyungyu.lee@nhn.com
 */
public class CalculatorProgram {
	public static void main(String[] args) {
		// 여기서 작성하세요.
		System.out.println("첫번째 정수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.println("두번째 정수를 입력 하세요");
		int num2 = sc.nextInt();

		Calculator cc = new Calculator();

		System.out.println("더한값 =" + cc.plus(num1, num2) + "입니다.");
	}
}
