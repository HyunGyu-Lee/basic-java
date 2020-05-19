package io.study.java.example.chapter6;

import java.util.Scanner;

public class KoreanMain {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력 하세요");
        String name = sc.nextLine();

        System.out.println("주민번호를 입력 하세요");
        String ssn = sc.nextLine();

        Korean kor1 = new Korean(name, ssn);
        Korean kor2 = new Korean();

        kor2.setName("ddd");
        kor2.setSsn("192019");

        System.out.println("이름은"+kor1.getName()+"주민번호는"+kor1.getSsn()+"입니다.");
        System.out.println("이름은"+kor2.getName()+"주민번호는"+kor2.getSsn()+"입니다.");



    }
}
