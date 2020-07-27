package io.study.java.examples.object.string.trim;

public class TrimExample {
    public static void main(String[] args) {

        String str = "   자바 프로그래밍     ";
        String str1 = "자바 프로그래밍";

        int strLength = str.length();
        int str1Length = str1.length();

        System.out.println(strLength);
        System.out.println(str1Length);

        String newStr = str.trim();

        int newStrLength = newStr.length();
        System.out.println(newStrLength);


    }
}
