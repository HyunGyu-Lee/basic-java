package sample1;

import java.io.*;


public class sample6 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("������ �Է��Ͻÿ�.");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res=Integer.parseInt(str);
		
		if(res%2==0) {
			System.out.println(+res+"(��)�� ¦�� �Դϴ�.");
		}
		else if(res%2==1) {
			System.out.println(+res+"(��)�� Ȧ�� �Դϴ�.");
		}
		
				
				
	}

}
