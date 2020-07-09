package io.study.java.examples.interface_example.feedback;

// 엔진 관련 클래스 모델에서 공통되는 속성 / 기능을 모아 구현
public abstract class AbstractEngine implements Engine {

    private String engineName;
    private String engineVersion;

    public AbstractEngine(String engineName, String engineVersion) {
        this.engineName = engineName;
        this.engineVersion = engineVersion;
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
    public void engineStart() {
        System.out.println(String.format("%s을 시작합니다. 엔진버전: %s", getEngineName(), getEngineVersion()));
    }
}
