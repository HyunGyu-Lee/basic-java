package io.study.java.examples.interface_example.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Car {
	private String name;
	private Engine engine;

	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}

	// 엔진 교체
	public void changeEngine(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		// 엔진 구동
		this.engine.engineStart();

		// 자동차 시동
		System.out.println(String.format("%s을 장착한 %s 자동차에 시동을 겁니다.", this.engine.getEngineName(), this.name));
	}
}
