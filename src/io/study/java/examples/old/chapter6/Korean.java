package io.study.java.examples.old.chapter6;

public class Korean {

    private String name;
    private String ssn;

    public Korean() {
        this.name = "";
        this.ssn = "";

    }

    public Korean(String name, String ssn) {
        this.name = name;
        this.name = ssn;

    }

    public void setName(String name){this.name = name;}

    public void setSsn(String ssn){this.ssn = ssn;}

    public String getName(){return this.name;}

    public String getSsn(){return this.ssn;}
}
