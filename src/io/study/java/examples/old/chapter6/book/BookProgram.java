package io.study.java.examples.old.chapter6.book;
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
        String bookType = sc.nextLine();

        BookPrint bookPrint = new BookPrint(bookType);

        bookPrint.setBookType(bookType);

        if(bookType.equals("K")){
            System.out.println("입력하신 내용을 ["+bookPrint.getBookType()+"] 로 출력합니다.");
            System.out.println(String.format("%s(%s 저)",book.getBookTitle(),book.getBookWriter()));
            System.out.println(String.format("%s",book.getBookKr()));

        }else if(bookType.equals("E")){
            System.out.println("입력하신 내용을 ["+bookPrint.getBookType()+"] 로 출력합니다.");
            System.out.println(String.format("%s(%s 저)",book.getBookTitle(),book.getBookWriter()));
            System.out.println(String.format("%s",book.getBookEn()));
        }








    }
}
