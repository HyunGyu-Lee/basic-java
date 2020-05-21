package io.study.java.example.chapter6.Coffee;

import java.util.Scanner;

public class CoffeeProgram {
    public void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("커피 머신을 실행 합니다.");
        System.out.println("아메리카노 1잔 가격을 입력하세요.");
        int amePrice = sc.nextInt();
        System.out.println("카페라떼 1잔 가격을 입력하세요.");
        int cafPrice = sc.nextInt();
        System.out.println("사이즈업 가격을 입력하세요.");
        int sizePrice = sc.nextInt();

        System.out.println("주문을 받습니다.");
        System.out.println("주문 형식은 커피종류_사이즈업여부,잔수");
        String orderString = sc.nextLine();



    }

}
