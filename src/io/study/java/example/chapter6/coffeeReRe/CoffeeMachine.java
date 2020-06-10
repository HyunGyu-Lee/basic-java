package io.study.java.example.chapter6.coffeeReRe;

public class CoffeeMachine {
    private int A,B,C;

    public CoffeeMachine(){
        this.A = 10;
        this.B = 20;
        this.C = 30;
    }

    public Coffee coffee(String coffeeType, int shot, int water){
        Coffee coffee = new Coffee(coffeeType,shot,water);

        if(coffee.getCoffeeType().equals("A")){
            A = A-1;
        }else if(coffee.getCoffeeType().equals("B")){
            B = B-1;
        }else if(coffee.getCoffeeType().equals("C")){
            C = C-1;
        }
        return coffee;

    }

    public void show(){
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }


}
