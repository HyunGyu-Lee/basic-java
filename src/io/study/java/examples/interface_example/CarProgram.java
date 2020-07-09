package io.study.java.examples.interface_example;


public class CarProgram {
    public static void main(String[] args) {
        Car car = new Car("좋은차(디젤)", new Diesel());
        Car car2 = new Car("좋은차(가솔린)", new Gasoline());


        car.start();

        car2.start();

        car.changeEngine(new Gasoline());
        car.start();

        car.finish();
    }
}
