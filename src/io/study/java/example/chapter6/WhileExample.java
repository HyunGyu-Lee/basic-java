package io.study.java.example.chapter6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int i = 0;
        Map<Integer, String> numberName = new HashMap<>();
        numberName.put(1, "one");
        numberName.put(2, "two");
        numberName.put(3, "three");
        numberName.put(4, "four");
        numberName.put(5, "five");

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력 합니다.");
        while (true) {
            System.out.println("0~10 사이 숫자를 입력하세요 (입력값이 음수면 프로그램 종료)");
            i = sc.nextInt();
            if (i < 0) {
                break;
            }
            System.out.println(numberName.get(i));




        }
    }
}
