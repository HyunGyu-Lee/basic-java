package io.study.java.example.chapter6.Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String args[]){



        Scanner sc = new Scanner(System.in);

        CalculatorMain cal = new CalculatorMain();

        System.out.println("숫자 2개를 수,수 형태로 입력 하세요.");
        String num = sc.nextLine();
        String[] nu = num.split(",");
        int left = Integer.parseInt(nu[0]);
        int right = Integer.parseInt((nu[1]));

        System.out.println("연산자를 입력하시오.");
        String type = sc.nextLine();

        System.out.println("아래계산을 수행합니다.");


    }
}
