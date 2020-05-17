package io.study.java.example.chapter6;

public class MyPointProgram {

    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();
        MyPoint myPoint1 = new MyPoint(10, 10);

        myPoint.setX(100);

        System.out.println("myPoint(x, y) " + myPoint.getX() + ", " + myPoint.getY());
        System.out.println("myPoint1(x, y) " + myPoint1.getX() + ", " + myPoint1.getY());
    }

}
