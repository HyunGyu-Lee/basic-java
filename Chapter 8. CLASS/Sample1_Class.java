package sample1;

class Car{
	int num;
	double gas;
	
	void show() {
	System.out.println("차량 번호는 "+this.num+ "입니다.");
	System.out.println("가스용량은 "+this.gas+ "입니다.");
}
	void showcar() {
		System.out.println("자동차 정보를 나타냅니다.");
		this.show();
	}
}

public class Sample1_Class {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showcar();
	}
	
	

		
		
		

	}
	



