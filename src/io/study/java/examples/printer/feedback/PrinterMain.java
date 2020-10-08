package io.study.java.examples.printer.feedback;

public class PrinterMain {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(new StudentInfo("홍길동", 1));
        printer.print(new ClassInfo(12345, 40));
    }

}
