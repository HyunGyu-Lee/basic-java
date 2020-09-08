package io.study.java.examples.school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsExample {
    public static void main(String[] args) {

        ArrayList<Students> array = new ArrayList<Students>();

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 기록부 관리 프로그램");

        int num = 0 ;

        while(num<=3) {
            if(num==3){
                System.out.println("종료합니다.");
                break;
            }
            System.out.println("============");
            System.out.println("1. 학생 입력");
            System.out.println("2. 기록부 조회");
            System.out.println("3. 종료");
            System.out.println("============");
            num = sc.nextInt();

            switch(num){
                case 1 :
                    System.out.println("이름을 입력하시오");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("반을 입력하시오");
                    String className = sc.nextLine();
                    System.out.println("나이를 입력하시오");
                    int age = sc.nextInt();

                    Students st = new Students(name,className,age);
                    array.add(st);
                    break;

                case 2 :
                    System.out.println("학생을 조회합니다");
                    if(array.size()==0){
                        System.out.println("등록된 학생이 없습니다.");
                    }
                    for(int i=0;i<array.size();i++)
                    System.out.println(String.format("%s. / %s / %s / %s",(i+1),array.get(i).getName(),array.get(i).getClassName(),array.get(i).getAge()));
            }


        }
    }
}
