package sample1;

import java.io.*;
public class Sample3_for {
	public static void main(String[] args) throws IOException
	{
		System.out.println("����� ���ϽǷ���?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.print("1����"+num+ "������ ����" +sum+ "�Դϴ�.");
	}

}
	
