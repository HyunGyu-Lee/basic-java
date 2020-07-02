package io.study.java.examples.interface_example;

public class Car implements Engine {


    private String carName;
    private String carEngine;
    private String engineName;
    private String engineVersion;


    public void carStart() {
        System.out.println("차 시동 ON");
        System.out.println(getEngineName(this.engineName));
        System.out.println(getEngineVersion(this.engineVersion));

    }


    public void engineStart() {
        System.out.println("엔진 구동");

    }


    public String getEngineName(String engineName) {
        this.engineName = engineName;

        return engineName;
    }


    public String getEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return engineVersion;
    }
}
