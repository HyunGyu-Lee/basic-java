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
    public void engineFix() {
        System.out.println(String.format("%s버전의 %s엔진을 수리합니다.", getEngineVersion(), getEngineName()));
    }

}
