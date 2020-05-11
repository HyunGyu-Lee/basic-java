package io.study.java.chapter9;

public class Car {
	public static int version = 0;
	private int num = 0;
	private double gas = 0;

	public void setCar(int n, double g) {
		this.num = n;
		this.gas = g;
	}

	public static void setVersion(int v) {
		version = v;
	}

	public void show() {
		System.out.println("차량버전: " + version);
		System.out.println("차량번호는 " + this.num + "입니다.");
		System.out.println("연료양은 " + this.gas + "입니다.");
	}
}
