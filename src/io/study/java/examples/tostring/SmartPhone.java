package io.study.java.examples.tostring;

public class SmartPhone {
    private String phoneName;
    private String os;

    public SmartPhone(String phoneName, String os){
        this.phoneName = phoneName;
        this.os = os;
    }

    @Override
    public String toString() {
        return phoneName + "," +os;
    }
}
