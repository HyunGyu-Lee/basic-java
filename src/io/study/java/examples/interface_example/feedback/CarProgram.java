package io.study.java.examples.interface_example.feedback;

/**
 * @author hyungyu.lee@nhn.com
 */
public class CarProgram {

	public static void main(String[] args) {
		Car car = new Car("좋은차(디젤)", new DieselEngine());
		Car car2 = new Car("좋은차(가솔린)", new GasolineEngine());

		// 디젤 차 시동
		car.start();

		// 가솔린 차 시동
		car2.start();

		// 디젤 차 엔진을 가솔린으로 변경
		car.changeEngine(new GasolineEngine());
		car.start();
	}

}
