package sample1;

import java.io.*;
public class Sample2_by {
	public static void main(String[] args) throws IOException
	{
		System.out.println("인원을 적으시오");					//맨 처음 출력 되는 문구
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));		// 값을 입력받기 위해 작성
		
		String str = br.readLine();			// str이라는 이름의 String 형으로 입력값을 입력 받는다
		int num = Integer.parseInt(str);		// 입력받은 str 값을 Int값으로 변환
		
		int[] test;							//test라는 이름의 배열 생성
		test = new int[num];
		
		System.out.println("시험 보는사람 수만큼 점수 입력하시오");		// 문구 출력
		
		for(int i=0; i<num; i++) {							// 반복문 실행
			
			str = br.readLine();							// str 값으로 입력 받는다
			int temp = Integer.parseInt(str);				// 입력받은 str 값을 temp라는 int형으로 변형시켜준다
			test[i] = temp;									// test 라는 배열[]에 temp 값을 넣어준다
		}
		for(int i=0; i<num; i++) {							//위에 반복문 끝나고 다른거 실행
			System.out.println((i+1)+"번째 사람의 점수는"+test[i]+"입니다.");
		}
		
	}

}
