package io.study.java.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5 {

	public static void main(String[] args) throws IOException {
		System.out.println("당신은 남성입니까?");
		System.out.println("Y또는N을 입력하여 주세요.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		if (res == 'y' || res == 'Y') {
			System.out.println("당신은 남성입니다.");
		} else if (res == 'N' || res == 'n') {
			System.out.println("당신은 여성입니다.");
		} else {
			System.out.println("제대로 입력해주세요.");
		}

	}

}
