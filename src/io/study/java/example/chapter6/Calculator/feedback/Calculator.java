package io.study.java.example.chapter6.Calculator.feedback;

public class Calculator {
    private int left;
    private int right;

    public Calculator() {
    }

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
