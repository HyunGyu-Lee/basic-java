package sample1;

import java.io.*;

public class Example3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("0~10까지의 수를 입력하시오.");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res>=0 && res<=10) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("오답입니다.");
		}
	}

}
