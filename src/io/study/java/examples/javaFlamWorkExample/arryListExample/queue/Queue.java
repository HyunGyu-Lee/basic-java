package io.study.java.examples.javaFlamWorkExample.arryListExample.queue;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("apple");
        list.add("melon");
        list.add("banana");


        String remove = list.poll();
        System.out.println("제거된것 : " +remove);   //FIFO

        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
