package io.study.java.chapter9.student.feedback;

import java.util.Scanner;

public class StudentMain {

	/***
	 * 1. 일단 문제에서 말한 출력방식이랑 다르게 출력됨
	 * 2. 그리고 총합 출력이 없음
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력 하세요.");
		String name = sc.nextLine();

		System.out.println("나이를 입력 하세요.");
		int age = sc.nextInt();

		System.out.println("국어 점수를 입력 하세요.");
		int koreanScore = sc.nextInt();

		System.out.println("수학 점수를 입력 하세요.");
		int mathScore = sc.nextInt();

		System.out.println("영어 점수를 입력 하세요.");
		int englishScore = sc.nextInt();

		System.out.println("숫자를 입력 하세요.");
		int num = sc.nextInt();

		StudentInfo studentInfo = new StudentInfo(name, age, koreanScore, mathScore, englishScore);

		if (num == 1) {
			System.out.println(studentInfo.getName() + "(" + studentInfo.getAge() + ") 성적 - 국어 : " + studentInfo.getKoreanScore() + ", 영어 : " + studentInfo.getEnglishScore() + ", 수학 : " + studentInfo.getMathScore() + ", 총합: " + studentInfo.getScoreTotal() + ", 평균: " + studentInfo.getScoreAverage());
		} else {
			System.out.println(studentInfo.getName() + "(" + studentInfo.getAge() + ") 성적 평균: " + studentInfo.getScoreAverage());
		}
	}

}
