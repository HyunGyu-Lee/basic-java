package io.study.java.examples.old.chapter6.Calculator.feedback;

public class CalculatorProgram {
    public int calculate(int left, String type, int right) {
        int result=0;


        if (type.equals("+")) {
            result = left + right;
            System.out.println(String.format("결과는 : %s",result));
        } else if (type.equals("-")) {
            result = left - right;
            System.out.println(String.format("결과는 : %s",result));
        } else if (type.equals("*")) {
            result = left * right;
            System.out.println(String.format("결과는 : %s",result));
        } else if (type.equals("%")) {
            result = left % right;
            System.out.println(String.format("결과는 : %s",result));
        }
        return result;
    }
}
