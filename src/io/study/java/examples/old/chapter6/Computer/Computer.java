package io.study.java.examples.old.chapter6.Computer;

public class Computer {

    private String name;
    private String mtinfo;
    private ComputerBody pc1;


    public Computer(String name, String mtinfo, ComputerBody pc1) {
        this.name = name;
        this.mtinfo = mtinfo;

    }

    public void boot() {
        System.out.println("입력하신 컴퓨터를 실행합니다.");
        System.out.println("[" + name + "]" + name);
        System.out.println("display:" + mtinfo);
        System.out.println("RAM:" + pc1.getRaminfo() + "GB");
        System.out.println("DISK:" + pc1.getDiskinfo() + "DISKSIZE:" + pc1.getDisksize());
    }


}


