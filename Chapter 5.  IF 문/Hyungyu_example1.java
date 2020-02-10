package sample1;

import java.io.*;
public class HyungyuExample1 {
	public static void main(String[] args) throws IOException {
		System.out.println("성별과 몸무게를 입력하여 주세요.");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받은 문자열을 , 기준으로 쪼갬 (M,65 ...)
		String[] data = br.readLine().split(",");
		
		// 쪼개진 문자열 ["M", "65"]을 성별(sex), 체중(weight) 변수에 할당
		String sex = data[0];
		int weight = Integer.parseInt(data[1]);
		
		int limit;
		
		// 성별 기준 비만 기준치(limit) 변수에 할당
		// toLowerCase()는 문자를 소문자로 바꿈 (String 클래스의 toLowerCase() 찾아볼 것)
		if ("m".equals(sex.toLowerCase()) {
		    limit = 80;
		} else if ("w".equals(sex.toLowerCase()) {
		    limit = 65;
		}
		
		// 체중(weight)이 비만 기준치(limit) 이상이면 비만 아니면 정상
		if (weight >= limit) {
		    System.out.println("비만입니다.");
		} else {
		    System.out.println("정상입니다.");	
		}
	}
}
