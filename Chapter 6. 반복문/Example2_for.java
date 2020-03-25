package sample1;

import java.io.*;
public class Example2_for {
	public static void main(String[] args) throws IOException
	{
		System.out.println("시험 점수를 입력하십시오.(0으로 종료)");
		int sum=0;
		for(int i=0;i<50;i++) {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			int res=Integer.parseInt(str);
			
			sum=res+sum;
			System.out.println(res);
			
			if(res==0) {
				
				break;
			}
		}
		
		System.out.println(sum);
		
		}
	
	}


	
	


