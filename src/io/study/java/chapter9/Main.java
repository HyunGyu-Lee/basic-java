package io.study.java.chapter9;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCar(1234,10.8);
		Car.setVersion(1);
		car1.show();

		Car car2 = new Car();
		car2.setCar(3838,0.11);
		Car.setVersion(4);
		car2.show();

		Car.setVersion(9);
		car1.show();


	}

}
