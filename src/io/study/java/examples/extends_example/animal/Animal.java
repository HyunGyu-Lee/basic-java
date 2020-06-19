package io.study.java.examples.extends_example.animal;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Animal {
	/**
	 * private: 진짜 자기 클래스 내에서만
	 * default: 같은 패키지내에서 가능
	 * protected : 같은 패키지 내에서 + 다른 패키지에 있더라도 상속한 경우 가능
	 * public : 어디서나 가능
	 */
	protected int legCount;
	protected String name;
	protected int age;

	public void run() {
		System.out.println(String.format("%d살 짜리 %s가 다리 %d개로 달린다", this.age, this.name, this.legCount));
	}
}
