package sample1;

import java.io.*;

public class Example3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("0~10������ ���� �Է��Ͻÿ�.");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		if(res>=0 && res<=10) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	}

}
