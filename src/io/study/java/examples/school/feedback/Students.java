package io.study.java.examples.school.feedback;

public class Students {
    private  String name;
    private String className;
    private int age;

    public Students(String name, String className, int age){
        this.name = name;
        this.className = className;
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public String getClassName(){
        return className;
    }
    public int getAge(){
        return age;
    }


}
