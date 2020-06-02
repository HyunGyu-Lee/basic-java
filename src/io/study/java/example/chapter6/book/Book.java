package io.study.java.example.chapter6.book;

public class Book {
    private String bookTitle;
    private String bookWriter;
    private String bookKr;
    private String bookEn;

    public Book(String bookTitle, String bookWriter, String bookKr, String bookEn){
        this.bookTitle = bookTitle;
        this.bookWriter = bookWriter;
        this.bookKr = bookKr;
        this.bookEn = bookEn;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public String getBookWriter(){
        return bookWriter;
    }

    public String getBookKr(){
        return bookKr;
    }

    public String getBookEn(){
        return bookEn;
    }
}
