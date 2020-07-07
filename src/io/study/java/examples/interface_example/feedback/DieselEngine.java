package io.study.java.examples.interface_example.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class DieselEngine implements Engine {

	private String engineName;
	private String engineVersion;

	public DieselEngine() {
		this.engineName = "디젤엔진";
		this.engineVersion = "v5";
	}

	@Override
	public void engineStart() {
		System.out.println(String.format("%s을 시작합니다. 엔진버전: %s", getEngineName(), getEngineVersion()));
	}

	@Override
	public String getEngineName() {
		return this.engineName;
	}

	@Override
	public String getEngineVersion() {
		return this.engineVersion;
	}
}
