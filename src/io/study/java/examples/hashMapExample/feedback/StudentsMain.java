package io.study.java.examples.hashMapExample.feedback;

import io.study.java.examples.hashMapExample.Students;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentsMain {

	public static void main(String[] args) {
		Map<Integer, Students> map = new HashMap();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num <= 4) {
			if (num == 4) {
				System.out.println("종료");
				break;
			}
			System.out.println("============");
			System.out.println("1. 학생 입력");
			System.out.println("2. 기록부 조회");
			System.out.println("3. 학생 번호로 조회");
			System.out.println("4. 종료");
			System.out.println("============");
			num = sc.nextInt();
			switch (num) {
				case 1:
					System.out.println("학생 번호를 입력하시오");
					int number = sc.nextInt();
					System.out.println("이름을 입력하시오");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("나이를 입력하시오");
					int age = sc.nextInt();

					Students st = new Students(name, age);
					map.put(number,st);

					break;
				case 2:
					System.out.println("학생 조회");
					if (map.size() == 0) {
						System.out.println("등록 데이터 없습니다.");
						break;
					} else {
						for(int key : map.keySet()){
							Students students = map.get(key);
							printStudentsInfo(key, students);
						}
					}
					break;
				case 3:
					System.out.println("학생 번호를 입력하세요");
					int searchNumber = sc.nextInt();
					if (map.containsKey(searchNumber)) {
						Students students = map.get(searchNumber);
						printStudentsInfo(searchNumber, students);
					} else {
						System.out.println(String.format("%d번 학생이 존재하지 않습니다.", searchNumber));
					}
					break;
			}
		}
	}

	private static void printStudentsInfo(int number, Students students) {
		System.out.println(String.format("[학생번호] : %d ,[이름] : %s ,[나이] : %s", number,
				students.getName(), students.getAge()));
	}
}
