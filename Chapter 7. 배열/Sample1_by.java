package sample1;

public class Sample1_by {
	public static void main(String[] args) {
		
		int[] test;
		test = new int[5];
		
		test[0] = 20;
		test[1] = 34;
		test[2] = 58;
		test[3] = 64;
		test[4] = 50;
		
		for(int i=0; i<5; i++ ) {
			System.out.println((i+1)+"번째 사람의 점수는"+test[i]+"점 입니다.");
		}
				
		
	}

}
