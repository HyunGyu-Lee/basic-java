package io.study.java.chapters.chapter9;

/**
 * @author hyungyu.lee@nhn.com
 */
public class Student {
	String n;
	int a;

	// 1. StudentProgram 에서 입력받은 name이랑 age를 n과 a에다가 대입해줘야함
	// 2. 반환해줄 것은 없음

	public void setNA(String name,int age){

		this.n=name;
		this.a=age;

	}

	public void show() {
		System.out.println("이름는" +n+ "입니다.");
		System.out.println("나이는" +a+ "입니다.");
	}





}
