package io.study.java.examples.interface_example;

public class AbstractEngine implements Engine{

    private String engineName;
    private String engineVersion;

    public AbstractEngine(String engineName, String engineVersion) {
        this.engineName = engineName;
        this.engineVersion = engineVersion;

    }

    @Override
    public void engineStart() {
        System.out.println(String.format("%s을 시작합니다. 엔진버전: %s", getEngineName(), getEngineVersion()));

    }

    @Override
    public String getEngineName() {
        return engineName;

    }

    @Override
    public String getEngineVersion() {
        return engineVersion;

    }

    @Override
    public void engineFinish() {
        System.out.println("엔진을 종료합니다.");

    }

    @Override
    public void engineFix() {

    }


}
