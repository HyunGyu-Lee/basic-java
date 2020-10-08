package io.study.java.examples.printer.feedback;

public class Printer {

    public <T extends Printable> void print(T printTarget){
        System.out.println("출력을 시작합니다.");
        System.out.println(printTarget.makeContent());
        System.out.println("출력이 완료되었습니다.");
    }

}
