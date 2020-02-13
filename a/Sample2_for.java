package sample1;

import java.io.*;

public class Sample2_for {
	public static void main(String[] args) throws IOException
	{
		System.out.println("몇개 출력하실래요?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		for(int i=1;i<=num;i++) {
			System.out.print('*');
		}
		
	}

}
