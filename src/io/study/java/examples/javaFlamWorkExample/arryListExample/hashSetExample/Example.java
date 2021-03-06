package io.study.java.examples.javaFlamWorkExample.arryListExample.hashSetExample;
import java.util.HashSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        Iterator hi = (Iterator) A.iterator();
        while (hi.hasNext()){
            System.out.println(hi.next());
        }

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(C));

        System.out.println(B.addAll(C));
        Iterator hh = (Iterator) B.iterator();
        while (hh.hasNext()){
            System.out.println(hh.next());
        }

        System.out.println(C.containsAll(A));
        System.out.println(A.containsAll(C));

    }
}
