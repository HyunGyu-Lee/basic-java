package io.study.java.examples.interface_example;


public class Gasoline extends AbstractEngine{

    public Gasoline() {
        super("가솔린엔진", "V4");
    }

    public void engineFix(){
        System.out.println(String.format("%s의 엔진을 수리합니다.",this.getEngineName()));
    }

}
