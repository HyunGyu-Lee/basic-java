package io.study.java.examples.hashsetExample;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList();



        for (int i = 0; i < 100; i++) {
            double random = Math.floor(Math.random() * 10);
            int num = (int) random;
            array.add(num);
            int ar = array.get(i);
            System.out.print(ar);
        }
        System.out.println(" ");

        Set<Integer> hash = new HashSet();

        for (int j = 0; j < 100; j++) {
            int num2 = (int) (Math.random()*10);
            hash.add(num2);

        }
        Iterator iterator = hash.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }


    }


}
