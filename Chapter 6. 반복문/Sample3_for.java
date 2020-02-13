package sample1;

import java.io.*;
public class Sample3_for {
	public static void main(String[] args) throws IOException
	{
		System.out.println("몇까지 더하실래요?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.print("1부터"+num+ "까지의 합은" +sum+ "입니다.");
	}

}
	
