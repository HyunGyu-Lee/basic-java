package io.study.java.examples.school;
import io.study.java.chapters.chapter9.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {

        String name ="";
        String className = "";
        int age=0;

        Scanner sc = new Scanner(System.in);



        System.out.println("학생 관리 프로그램");
        System.out.println("===============");
        System.out.println("1. 학생 입력");
        System.out.println("2. 기록부 조회");
        System.out.println("3. 종료");
        System.out.println("===============");

        int num = sc.nextInt();

            ArrayList<Students> school = new ArrayList<Students>();

            switch (num) {


                case 1:
                    System.out.println("학생 이름 입력을 시작합니다.");
                    System.out.println("이름");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("반");
                    className = sc.nextLine();
                    System.out.println("나이");
                    age = sc.nextInt();
                    Students std = new Students(name, className, age);
                    school.add(std);

                    System.out.println("등록이 완료되었습니다.");


                case 2:
                    System.out.println("학생을 조회합니다.");
                    if (school.size() == 0) {
                        System.out.println("등록 학생이 없습니다.");
                    }
                    for (int i = 0; i <= school.size(); i++) {
                        System.out.println(String.format("%s / %s / %s", school.get(i).getName(), school.get(i).getClassName(), school.get(i).getAge()));
                    }


                case 3:
                    System.out.println("종료합니다.");
                    break;
            }



    }
}
