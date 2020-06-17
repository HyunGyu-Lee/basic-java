package io.study.java.chapters.chapter8;

public class Car {
	int num;
	double gas;

	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호를 " + num + "으로, 연료양을 " + gas + "로 변경하였습니다.");
	}

	void show() {
		System.out.println("차량번호는 " + num + "입니다.");
		System.out.println("연료양은 " + gas + "입니다.");
	}
}