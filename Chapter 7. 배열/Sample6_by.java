package sample1;

import java.io.*;
public class Sample6_by {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] test = new int[5];
		System.out.println(test.length + "���� ������ �Է��Ͻÿ�.");
		for(int i=0; i<test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		for(int s=0; s<test.length-1; s++) {
			for(int t=s+1; t<test.length; t++) {
				if(test[t] > test[s]) {
					int temp = test[t];
					test[t] = test[s];
					test[s] = temp;
				}
			}
		}
		for(int j=0; j<test.length; j++ ) {
			System.out.println((j+1)+"��° ����� ������ " +test[j]+ " �Դϴ�.");
		}
	}
	

}
