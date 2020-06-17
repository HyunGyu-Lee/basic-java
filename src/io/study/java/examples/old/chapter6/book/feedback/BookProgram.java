package io.study.java.examples.old.chapter6.book.feedback;

import java.util.Scanner;

/**
 * @author dlgusrb0808@gmail.com
 */
public class BookProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("책 정보를 입력합니다.");
		System.out.println("책 제목을 입력하세요.");
		String bookTitle = sc.nextLine();
		System.out.println("책 저자를 입력하세요.");
		String bookWriter = sc.nextLine();
		System.out.println("책 내용을 한글로 입력하세요.");
		String bookKr = sc.nextLine();
		System.out.println("책 내용을 영어로 입력하세요.");
		String bookEn = sc.nextLine();

		// 책 객체 생성
		Book book = new Book(bookTitle, bookWriter, bookKr, bookEn);

		System.out.println("출력 타입을 입력하세요.");
		String printType = sc.nextLine();

		// 책 출력기 객체 생성
		BookPrint bookPrint = new BookPrint(printType);

		// 책 정보를 책 출력기를 통해 출력하고 싶음
		// 책 출력기에 책 내용을 출력하는 메소드를 정의
		// 아래 코드는 책 출력기 객체에 내가 출력하고 싶은 책 객체를 전달하는 것
		bookPrint.print(book);
	}
}
