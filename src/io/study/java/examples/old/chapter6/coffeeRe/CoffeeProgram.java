package io.study.java.examples.old.chapter6.coffeeRe;

import java.util.Scanner;

public class CoffeeProgram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("커피 종류 입력");
        String coffeeMenu = sc.nextLine();
        System.out.println("커피 샷 수 입력");
        int shot = sc.nextInt();
        System.out.println("물 양 입력");
        int water = sc.nextInt();


        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setCoffee(coffeeMenu,shot,water);


    }
}
