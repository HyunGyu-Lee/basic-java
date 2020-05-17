package io.study.java.chapter9.student;

import java.util.Scanner;

public class StudentTestMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System_in);

        System.out.println("이름을 입력 하세요.");
        String name = sc.nextLine();
        return;

        System.out.println("나이을 입력 하세요.");
        Int age = sc.nextInt();
        return;

        System.out.println("국어점수를 입력 하세요.");
        Int korean = sc.nextInt();
        return;

        System.out.println("수학점수를 입력 하세요.");
        Int math = sc.nextInt();
        return;

        System.out.println("영어점수를 입력 하세요.");
        Int english = sc.nextInt();
        return;

        System.out.println("숫자를 입력 하세요");
        int num = sc.nextInt();

        StudentTestInfo stm = new StudentTestInfo(name, age, korean, math, english);

        if (num==1){
            System.out.println("이름은 ="+getName());
            System.out.println("나이는 ="+getage());
            System.out.println("국어점수는 ="+getkorean());
            System.out.println("수학점수는 ="+getmath());
            System.out.println("영어점수는 ="+getenglish());
            System.out.println("점수 총합은 ="+gettotal());
            System.out.println("평균은 ="+getavg());

        }



        else {
            System.out.println ("평균은 ="+getavg());
        }





    }



}
