package io.study.java;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        String s = "커피종류_커피가격,커피잔수";

        String[] sArr = s.split(",");
        String[] sArr = s.split("_");
        String[] sArr2 = new String[3];


        System.out.println(s);
        System.out.println(sArr[0]);
        System.out.println(sArr[1]);
        System.out.println(sArr[2]);

        System.out.println("주문을 받습니다.");
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();


    }

    public 커피[] order(String orderString) {
        // orderString
        // 아메리카노고
        // 사이즈업이고
        // 3잔이네

        return new 커피[3];
    }

}
