package sample1;

class Car{
	int num;
	double gas;
	
	void show() {
	System.out.println("���� ��ȣ�� "+this.num+ "�Դϴ�.");
	System.out.println("�����뷮�� "+this.gas+ "�Դϴ�.");
}
	void showcar() {
		System.out.println("�ڵ��� ������ ��Ÿ���ϴ�.");
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
	



