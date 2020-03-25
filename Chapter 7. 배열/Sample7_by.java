package sample1;

public class Sample7_by {
	public static void main(String[] args) {
		int [][] test = new int[2][5];
		
		test[0][0] = 80;
		test[0][1] = 70;
		test[0][2] = 91;
		test[0][3] = 30;
		test[0][4] = 50;
		test[1][0] = 40;
		test[1][1] = 20;
		test[1][2] = 50;
		test[1][3] = 70;
		test[1][4] = 10;
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+"번째 사람의 국어점수는" +test[0][i]+ "입니다.");
			System.out.println((i+1)+"번째 사람의 수학점수는" +test[1][i]+ "입니다.");
		}
		
	}

}
