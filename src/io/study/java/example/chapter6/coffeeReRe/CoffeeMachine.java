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

        if(coffee.getCoffeeType()=="A"){
            int A =-1;
        }else if(coffee.getCoffeeType()=="B"){
            int B =-1;
        }else if(coffee.getCoffeeType()=="C"){
            int C=-1;
        }

        return coffee;
    }


}
