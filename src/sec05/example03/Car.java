package sec05.example03;

public class Car {

    int speed;

    void run(){
        System.out.println(speed+"달립니다.");
        }

    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 60;
        car.run();

    }
}
