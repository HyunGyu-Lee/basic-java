package io.study.java.examples.printer;

public class PrinterMain {
    public static void main(String[] args) {



        Printer<String> pt = new Printer("nice to meet you");
        Printer<Integer> pt1 = new Printer("12345");

        pt.printItem(pt.getText());
        pt1.printItem(pt1.getText());

    }
}
