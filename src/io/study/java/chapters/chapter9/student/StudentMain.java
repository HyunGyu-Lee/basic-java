package io.study.java.chapters.chapter9.student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String args[]) {
		
		
		
		StudentInfo st = new StudentInfo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력 하세요.");
		String name = sc.nextLine();
		
		
		System.out.println("나이를 입력 하세요.");
		int age = sc.nextInt();
		
		System.out.println("국어 점수를 입력 하세요.");
		int korean = sc.nextInt();
		
		System.out.println("수학 점수를 입력 하세요.");
		int math = sc.nextInt();
		
		System.out.println("영어 점수를 입력 하세요.");
		int english = sc.nextInt();
		
		System.out.println("숫자를 입력 하세요.");
		int num = sc.nextInt();
		
		
		
		st.SetStudent(name, age, korean, math, english);
		st.StudentName();
		st.StudentRecord();
		st.Studentmultiple();
		st.StudentAvg();
		
		
		if(num == 1) {
			System.out.println("이름 : "+name+age+"국어 : "+korean+", 영어 : "+english+", 수학 : "+math);
	
			}
		else {
			System.out.println("평균 :"+((korean+english+math)/2));

		}
		

		
		
		
		
		
		
		
		
		
	}

}
