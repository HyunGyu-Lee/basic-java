package io.study.java.examples.interface_example.feedback;

/**
 * @author dlgusrb0808@gmail.com
 */
public class DieselEngine extends AbstractEngine implements Engine {

	private String engineName;
	private String engineVersion;


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


	@Override
	public void EngineInformation(String engineName, String engineVersion) {
		this.engineName = "디젤엔진";
		this.engineVersion = "v5";
	}
}
