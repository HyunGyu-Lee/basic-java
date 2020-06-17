package io.study.java.chapters.chapter9.student;

public class CarMain {
    public static void main(String args[]){

        Car car1 = new Car();
        car1.setNumGas(102,10.5);

        int num = car1.getNum();
        double gas = car1.getGas();

        System.out.println("자동차 조회 결과");
        System.out.println("번호는"+num+"가스양은"+gas);

        car1.show();
    }
}
