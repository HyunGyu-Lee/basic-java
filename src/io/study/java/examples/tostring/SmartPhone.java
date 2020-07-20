package io.study.java.examples.tostring;

public class SmartPhone {
    private String name;
    private String os;

    public SmartPhone(String name, String os){
        this.name = name;
        this.os = os;
    }

    @Override
    public String toString() {
        return name + "," +os;
    }
}
