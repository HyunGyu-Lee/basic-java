package sample1;

public class Sample4_by {
	public static void main(String[] args) {
		
		int[] test1 = new int[3];
		
		
		System.out.println("test1�� �����߽��ϴ�.");
		System.out.println("�迭 ��Ҹ� �����߽��ϴ�.");
		
		test1 [0] = 60;
		test1 [1] = 20;
		test1 [2] = 40;
		
		int[] test2;
		System.out.println("test2�� �����߽��ϴ�.");
		
		test2 = test1;
		System.out.println("test2�� test1�� �����Ͽ����ϴ�.");
		
		for(int i=0; i<3; i++) {
			System.out.println("test1�� ����Ű��" + (i+1) + "��° ����� ������" + test1[i] + "�Դϴ�");
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("test2�� ����Ű��" + (i+1) + "��° ����� ������" + test2[i] + "�Դϴ�");
		}
		
		test1 [2] = 100;
		System.out.println("test1�� ����° ��� ������ �����մϴ�.");
		
		for(int i=0; i<3; i++) {
			System.out.println("test2�� ����Ű��" + (i+1) + "��° ����� ������" + test2[i] + "�Դϴ�");
		}
	}

}
