package io.study.java.examples.javaFlamWorkExample.arryListExample.stack;
import java.util.LinkedList;

public class Stack {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("apple");
        list.add("melon");
        list.add("banana");


        String remove = list.removeLast();
        System.out.println("제거된것 : " +remove);  //LIFO

        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
