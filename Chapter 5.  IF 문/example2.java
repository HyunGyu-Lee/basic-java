package sample1;

import java.io.*;

public class example2 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("2���� ������ �Է��Ͻÿ�");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		int res1=Integer.parseInt(str1);
		int res2=Integer.parseInt(str2);
		
		if(res1==res2) {
			System.out.println("�� ���ڴ� �����ϴ�.");
		}
		else if(res1!=res2){
			System.out.println(+res2+"�� �� Ů�ϴ�");
		}
		
		}
		
		
	}


