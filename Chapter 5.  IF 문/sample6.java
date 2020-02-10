package sample1;

import java.io.*;


public class sample6 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("정수를 입력하시오.");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res=Integer.parseInt(str);
		
		if(res%2==0) {
			System.out.println(+res+"(은)는 짝수 입니다.");
		}
		else if(res%2==1) {
			System.out.println(+res+"(은)는 홀수 입니다.");
		}
		
				
				
	}

}
