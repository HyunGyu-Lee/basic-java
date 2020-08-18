package io.study.java.examples.javaFlamWorkExample.arryListExample.mapExample;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        HashMap<String,Integer> hh = new HashMap<String,Integer>();

        hh.put("one", 1);
        hh.put("two", 2);
        hh.put("three",3);
        hh.put("four", 4);

        System.out.println(hh.get("one"));
        System.out.println(hh.get("two"));
        System.out.println(hh.get("three"));
        System.out.println(hh.get("four"));

        iteratorUsingForEach(hh);
        iteratorUsingIterator(hh);


    }

    private static void iteratorUsingIterator(HashMap hh) {
        Set<Map.Entry<String,Integer>> map = hh.entrySet();
        Iterator<Map.Entry<String,Integer>> ent = map.iterator();
        while (ent.hasNext()){
            Map.Entry<String,Integer> entr = ent.next();
            System.out.println(entr.getKey() +", "+ entr.getValue());
        }
    }

    private static void iteratorUsingForEach(HashMap hh) {
        Set<Map.Entry<String,Integer>> entri = hh.entrySet();
        for(Map.Entry<String,Integer> entry : entri){
            System.out.println(entry.getKey() +", "+ entry.getValue());
        }

    }
}
