package io.study.java.example.chapter6.coffeeRe;

public class CoffeeMachine {
     private int A=10,B=11,C=12;


    public void setCoffee(String coffeMenu, int shot, int water){
        Coffee coffee = new Coffee(coffeMenu,shot,water);


        if(coffee.getCoffeeMenu().equals("A")){
            A=A-1;
            return;

        }else if(coffee.getCoffeeMenu().equals("B")){
            B=B-1;
            return;

        }else if(coffee.getCoffeeMenu().equals("c")){
            C=C-1;
            return;
        }
        System.out.println("남은 원두의 갯수는");
        System.out.println(String.format("A = %s, B = %s, C = %s",A,B,C));

    }



}
