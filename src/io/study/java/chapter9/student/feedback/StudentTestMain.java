package io.study.java.chapter9.student.feedback;

import java.util.Scanner;

public class StudentTestMain {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력 하세요");
        String name = sc.nextLine();

        System.out.println("나이를 입력 하세요");
        int age = sc.nextInt();

        System.out.println("국어점수를 입력하세요");
        int korean = sc.nextInt();

        System.out.println("수학점수를 입력 하세요");
        int math = sc.nextInt();

        System.out.println("영어점수를 입력 하세요");
        int english = sc.nextInt();

        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();

        StudentTestInfo stf = new StudentTestInfo(name, age, korean, math, english);

        if(num ==1){
            System.out.println(stf.getName()+stf.getAge()+stf.getEnglish()+stf.getKorean()+stf.getMath());
        }

        else {
            System.out.println(stf.avgRecord());
        }





    }
}
