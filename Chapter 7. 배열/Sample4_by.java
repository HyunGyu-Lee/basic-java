package sample1;

public class Sample4_by {
	public static void main(String[] args) {
		
		int[] test1 = new int[3];
		
		
		System.out.println("test1을 선언했습니다.");
		System.out.println("배열 요소를 생성했습니다.");
		
		test1 [0] = 60;
		test1 [1] = 20;
		test1 [2] = 40;
		
		int[] test2;
		System.out.println("test2를 선언했습니다.");
		
		test2 = test1;
		System.out.println("test2에 test1을 대입하였습니다.");
		
		for(int i=0; i<3; i++) {
			System.out.println("test1이 가리키는" + (i+1) + "번째 사람의 점수는" + test1[i] + "입니다");
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("test2이 가리키는" + (i+1) + "번째 사람의 점수는" + test2[i] + "입니다");
		}
		
		test1 [2] = 100;
		System.out.println("test1의 세번째 사람 점수를 변경합니다.");
		
		for(int i=0; i<3; i++) {
			System.out.println("test2이 가리키는" + (i+1) + "번째 사람의 점수는" + test2[i] + "입니다");
		}
	}

}
