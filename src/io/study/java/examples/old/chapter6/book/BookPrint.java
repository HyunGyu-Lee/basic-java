package io.study.java.examples.old.chapter6.book;

public class BookPrint {
    private String bookType;



    public BookPrint(String bookType) {
        this.bookType = bookType;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType){
        if(bookType.equals("K")){
            this.bookType="한글";
        }else if(bookType.equals("E")){
            this.bookType="영어";
        }
    }

}



