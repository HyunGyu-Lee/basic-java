package io.study.java.examples.interface_example;

public class Car{

    private String carName;
    private Engine engine;

    public Car(String carName, Engine engine){
        this.carName = carName;
        this.engine = engine;
    }

    public void changeEngine(Engine engine) {

        this.engine = engine;

        System.out.println(String.format("%s 엔진으로 교체합니다.",engine.getEngineName()));
    }

    public void start() {

        this.engine.engineStart();

        System.out.println(String.format("%s을 장착한 %s 자동차에 시동을 겁니다.", this.engine.getEngineName(), this.carName));

    }

    public void finish(){
        System.out.println(String.format("%s을 장착한 %s 자동차에 시동을 끕니다.", this.engine.getEngineName(), this.carName));
        engine.engineFinish();

    }


}
