package sample1;
import java.io.*;

public class Sample5 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("����� �����Դϱ�?");
		System.out.println("Y�Ǵ�N�� �Է��Ͽ� �ּ���.");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		char res=str.charAt(0);
		
		if(res=='y' || res=='Y')
		{
			System.out.println("����� �����Դϴ�.");
		}
		else if(res=='N'||res=='n')
		{
			System.out.println("����� �����Դϴ�.");
		}	
		else {
				System.out.println("����� �Է����ּ���.");
			}
				
			}
		
		
	}

