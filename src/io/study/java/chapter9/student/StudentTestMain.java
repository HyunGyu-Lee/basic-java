package io.study.java.chapter9.student;

import io.study.java.chapter9.student.feedback.StudentTestInfo;

import java.util.Scanner;

public class StudentTestMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력 하세요.");
        String name = sc.nextLine();


        System.out.println("나이을 입력 하세요.");
        int age = sc.nextInt();


        System.out.println("국어점수를 입력 하세요.");
        int korean = sc.nextInt();


        System.out.println("수학점수를 입력 하세요.");
        int math = sc.nextInt();

        System.out.println("영어점수를 입력 하세요.");
        int english = sc.nextInt();


        System.out.println("숫자를 입력 하세요");
        int num = sc.nextInt();

        StudentTestInfo stm = new StudentTestInfo(name, age, korean, math, english);

        if (num == 1) {
            System.out.println("이름은 =" + stm.getName());
            System.out.println("나이는 =" + stm.getAge());
            System.out.println("국어점수는 =" + stm.getKorean());
            System.out.println("수학점수는 =" + stm.getMath());
            System.out.println("영어점수는 =" + stm.getEnglish());
            System.out.println("점수 총합은 =" + stm.totalRecord());
            System.out.println("평균은 =" + stm.avgRecord());

        } else {
            System.out.println("평균은 =" + stm.avgRecord());
        }


    }


}
