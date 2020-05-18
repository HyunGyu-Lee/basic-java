package io.study.java.chapter9.student;

public class Car {
	int num;
	double gas;

	public int getNum(){
		System.out.println("차량번호를 조사했습니다.");
		return this.num;
	}

	public double getGas(){
		System.out.println("가스양을 조사했습니다.");
		return this.gas;
	}

	public void setNumGas(int n, double g){
		this.num = n;
		this.gas = g;

		System.out.println("차량 번호를"+num+"가스양을"+gas+"로 변경하였습니다.");
	}

	public void show(){
		System.out.println("차량 번호는"+this.num+"입니다.");
		System.out.println("가스 양은"+this.gas+"입니다.");
	}




}
