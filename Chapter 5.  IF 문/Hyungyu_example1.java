package sample1;

import java.io.*;
public class Hyungyu_example1 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("������ �����Ը� �Է��Ͽ� �ּ���.");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		char res1=str1.charAt(0);
		int res2=Integer.parseInt(str2);
		
		
		if((res1=='M'||res1=='m') && res2>=80) {
			System.out.println("���Դϴ�.");
		}
		else if((res1=='W'||res1=='y')&& res2>=65) {
			System.out.println("���Դϴ�.");
		}
		else
			System.out.println("�����Դϴ�.");
		
			
		}
	}


