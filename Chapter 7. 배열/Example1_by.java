package sample1;

import java.io.*;
public class Example1_by {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] ex = new int[5];
		System.out.println("5명의 점수를 입력하십시오.");
		
		for(int i=0; i<ex.length; i++) {
			String str = br.readLine();
			ex[i] = Integer.parseInt(str);
		}
		for(int s=0; s<ex.length-1; s++) {
			for(int t=s+1; t<ex.length; t++) {
				if(ex[t] > ex[s]) {
					int temp = ex[t];
					ex[t] = ex[s];
					ex[s] = temp;
					
				}
			}
			
		}
		for(int j=0; j<ex.length; j++ ) {
			System.out.println((j+1)+"번째 사람의 점수는 " +ex[j]+ " 입니다.");
	}

	}
}
