package io.study.java.chapters.chapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample1 {

	public static void main(String[] args) throws Exception {
		System.out.println("정수를 입력하십시오");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if (res == 1) {
			System.out.println("1이입력되었습니다.");
		}
		else if(res == 2) {
			System.out.println("2가 입력되었습니다.");
		}
		else {
			System.out.println("다 아닙니다.");
		}
		System.out.println("처리를 종료합니다.");
	}

}
