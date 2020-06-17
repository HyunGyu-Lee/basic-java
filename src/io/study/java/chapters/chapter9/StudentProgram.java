package io.study.java.chapters.chapter9;

import java.util.Scanner;

/**
 * @author hyungyu.lee@nhn.com
 */
public class StudentProgram {

	public static void main(String[] args) {
		System.out.println("이름을 입력하시오");
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();

		System.out.println("나이를 입력하시오");
		int age = sc.nextInt();

		Student student = new Student();
		student.setNA(name,age);
		student.show();
	}

}
