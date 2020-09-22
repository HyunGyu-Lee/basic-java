package io.study.java.examples.school.feedback;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsExample {
    public static void main(String[] args) {
        // 컬렉션 변수 선언 시 인터페이스로 선언하는 것 권장
        // 뒤의 <>는 생략 가능 <>는 Generic인데 따로 공부 필요
        List<Students> array = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 기록부 관리 프로그램");

        int num = 0;

        while(num<=3) {
            System.out.println("============");
            System.out.println("1. 학생 입력");
            System.out.println("2. 기록부 조회");
            System.out.println("3. 종료");
            System.out.println("============");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("이름을 입력하시오");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("반을 입력하시오");
                    String className = sc.nextLine();
                    System.out.println("나이를 입력하시오");
                    int age = sc.nextInt();

                    Students st = new Students(name, className, age);
                    array.add(st);
                    break;

                case 2:
                    System.out.println("학생을 조회합니다");
                    if (array.size() == 0) {
                        System.out.println("등록된 학생이 없습니다.");
                    } else {
                        for(Students students : array){
                            int j=0;
                            System.out.println(String.format("%s. / %s / %s / %s", (j + 1), students.getName(), students.getClassName(), students.getAge()));
                        }

                    }
                case 3:
                    System.out.println("종료합니다.");
                    return;
            }
        }
    }
}
