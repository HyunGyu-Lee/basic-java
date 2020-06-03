package io.study.java.example.chapter6.book.bookRecheck;

import io.study.java.example.chapter6.book.feedback.Book;
import io.study.java.example.chapter6.book.feedback.BookPrint;

import java.util.Scanner;

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

        Book book = new Book(bookTitle, bookWriter, bookKr, bookEn);

        System.out.println("출력 타입을 입력하세요.");
        String printType = sc.nextLine();


        BookPrint bookPrint = new BookPrint(printType);


        bookPrint.print(book);
    }

}
