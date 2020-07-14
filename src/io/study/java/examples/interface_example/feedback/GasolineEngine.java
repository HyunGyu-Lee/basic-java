package io.study.java.examples.interface_example.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class GasolineEngine extends AbstractEngine {

	public GasolineEngine() {
		super("가솔린엔진", "v5");
	}

	// 가솔린 엔진만의 추가 기능이 들어갈 수 있음

	@Override
	public void engineFix() {
		System.out.println(this.getEngineName() + "엔진 수리~~");

		// 가솔린 엔진의 수리 작업 추가 수행
		System.out.println("추가 수리 작업 수행~~~");
	}
}
