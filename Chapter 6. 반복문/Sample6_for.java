package sample1;
import java.io.*;
public class Sample6_for {
	public static void main(String[] args) throws IOException
	{
		System.out.println("언제 멈추시겠습니까(1~10)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+ "번째 처리입니다.");
			if(i==res)
				break;
		}
		
	}
	

}
