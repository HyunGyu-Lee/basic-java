package io.study.java.examples.javaFlamWorkExample.arryListExample;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();


        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));

    }
}
