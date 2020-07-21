package io.study.java.examples.object.equalsHashExample;

import io.study.java.examples.object.equalsHashExample.SmartPhone;

public class SmartPhoneProgram {
    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("김정우","123456789");
        SmartPhone smartPhone2 = new SmartPhone("김정우","987654321");
        SmartPhone smartPhone3 = new SmartPhone("이현규","011973748");

        if(smartPhone1.equals(smartPhone2)){
            System.out.println("동일합니다.");
        } else
            System.out.println("동일하지 않습니다.");

        if(smartPhone2.equals(smartPhone3)){
            System.out.println("동일합니다.");
        } else
            System.out.println("동일하지 않습니다.");

        if(smartPhone1.equals(smartPhone3)){
            System.out.println("동일합니다.");
        } else
            System.out.println("동일하지 않습니다.");

        System.out.println(smartPhone1.hashCode()==smartPhone2.hashCode());
        System.out.println(smartPhone2.hashCode()==smartPhone3.hashCode());
        System.out.println(smartPhone1.hashCode()==smartPhone3.hashCode());
    }


}
