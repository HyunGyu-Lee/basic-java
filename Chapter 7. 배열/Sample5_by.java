package sample1;

public class Sample5_by {
	public static void main(String[] args) {
		int[] test = {10,20,30,40,50};
		
		for(int i=0; i<test.length; i++) {
			System.out.println((i+1) + "번째 사람의 점수는" +test[i]+ "입니다.");
		}
		System.out.println("시험 응시자 수는 " + test.length +"입니다.");
	}

}
