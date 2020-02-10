package sample1;

import java.io.*;

public class example2 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("2개의 정수를 입력하시오");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		int res1=Integer.parseInt(str1);
		int res2=Integer.parseInt(str2);
		
		if(res1==res2) {
			System.out.println("두 숫자는 같습니다.");
		}
		else if(res1!=res2){
			System.out.println(+res2+"가 더 큽니다");
		}
		
		}
		
		
	}


