package sample1;
import java.io.*;
public class example4 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("성적을 입력하여 주세요.");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
		case 1:
			System.out.println("노력합시다.");
			break;
		case 2:
			System.out.println("조금 더 노력합시다.");
			break;
			
		case 3:
			System.out.println(" 더 높은 점수를 목표로 합시다. ");
			break;
			
		case 4:
			System.out.println("매우 잘했습니다.");
			break;
			
		case 5:
			System.out.println("매우 우수합니다.");
			break;
			
			default:
				System.out.println("다시입력하세요");
		
		
		
		}
		
		
		}
	}


