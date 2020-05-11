package io.study.java.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {

	public static void main(String[] args) throws IOException {
		System.out.println("a 또는 b를 입력 하십시오.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		switch (res) {
			case 'a':
				System.out.println("a가 입력되었습니다.");
				break;
			case 'b':
				System.out.println("b가 입력되었습니다.");
				break;

			default:
				System.out.println("a또는 b를 입력해주십시오.");
				break;
		}
	}

}
