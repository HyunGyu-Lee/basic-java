package sample1;

import java.io.*;
public class Hyungyu_example1 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("성별과 몸무게를 입력하여 주세요.");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		char res1=str1.charAt(0);
		int res2=Integer.parseInt(str2);
		
		
		if((res1=='M'||res1=='m') && res2>=80) {
			System.out.println("비만입니다.");
		}
		else if((res1=='W'||res1=='y')&& res2>=65) {
			System.out.println("비만입니다.");
		}
		else
			System.out.println("정상입니다.");
		
			
		}
	}


