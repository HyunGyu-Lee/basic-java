package io.study.java.examples.school;

import io.study.java.chapters.chapter9.Student;

import java.util.Iterator;

public class Students {
    private String name;
    private String className;
    private int age;

    public Students(String name, String className, int age) {
        this.name = name;
        this.className = className;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }
}






