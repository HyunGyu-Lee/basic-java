package io.study.java.examples.interface_example;

public class Diesel extends AbstractEngine{


    public Diesel() {

        super("디젤엔진", "v5");
    }

    public void engineFix(){
        System.out.println(String.format("%s의 엔진을 수리합니다.",this.getEngineName()));
    }


}
