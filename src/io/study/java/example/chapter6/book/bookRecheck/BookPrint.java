package io.study.java.example.chapter6.book.bookRecheck;

public class BookPrint {
    private String printType;

    public BookPrint(String bookType){
        this.printType = bookType;
    }

    public void BookPr(Book book){
        if(this.printType.equals("K")){
            System.out.println("입력하신 내용을 [한글] 로 출력합니다.");
            System.out.println(String.format("%s(%s 저)",book.getBookTitle(),book.getBookWriter()));
            System.out.println(String.format("%s",book.getBookKr()));
        }else if(this.printType.equals("E")){
            System.out.println("입력하신 내용을 [영어] 로 출력합니다.");
            System.out.println(String.format("%s(%s 저)",book.getBookTitle(),book.getBookWriter()));
            System.out.println(String.format("%s",book.getBookEn()));
        }
    }
}
