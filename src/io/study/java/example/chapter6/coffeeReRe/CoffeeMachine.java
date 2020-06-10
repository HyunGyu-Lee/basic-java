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
            this.A = this.A-1;
        }else if(coffee.getCoffeeType().equals("B")){
            this.B = this.B-1;
        }else if(coffee.getCoffeeType().equals("C")){
            this.C = this.C-1;
        }
        return coffee;

    }

    public void show(){
        System.out.println(this.A);
        System.out.println(this.B);
        System.out.println(this.C);
    }


}
