package io.study.java.examples.interface_example;

public class Gasoline implements Engine{
    private String engineName;
    private String engineVersion;

    public Gasoline(String engineName, String engineVersion){
        this.engineName = engineName;
        this.engineVersion = engineVersion;

    }

    public void engineStart() {

    }


    public String getEngineName(String engineName) {
        return engineName;
    }


    public String getEngineVersion(String engineVersion) {
        return engineVersion;
    }
}
