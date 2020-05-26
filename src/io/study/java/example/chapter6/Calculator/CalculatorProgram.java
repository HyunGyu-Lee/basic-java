package io.study.java.example.chapter6.Calculator;

public class CalculatorProgram {

    public int Calculate(int rightNum, String type, int leftNum) {

        int result = 0;


        if (type.equals("+")) {
            result = rightNum + leftNum;
            System.out.println(String.format("결과는 : %s", result));
        } else if (type.equals("-")) {
            result = rightNum - leftNum;
            System.out.println(String.format("결과는 : %s", result));
        } else if (type.equals("*")) {
            result = rightNum * leftNum;
            System.out.println(String.format("결과는 : %s", result));
        } else if (type.equals("%")) {
            result = rightNum % leftNum;
            System.out.println(String.format("결과는 : %s", result));
        }
        return result;

    }
}