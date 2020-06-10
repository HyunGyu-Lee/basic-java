package io.study.java.example.chapter6.coffeeReRe;

import java.util.Scanner;

public class CoffeeMain {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Scanner sc = new Scanner(System.in);

        System.out.println("커피원두 종류를 입력 하세요(ABC중 택 1)");
        String coffeeType = sc.nextLine();
        System.out.println("샷 수를 입력 하세요.");
        int shot = sc.nextInt();
        System.out.println("물의 양을 입력 하세요.");
        int water = sc.nextInt();

        coffeeMachine.coffee(coffeeType,shot,water);
        coffeeMachine.show();






    }
}
