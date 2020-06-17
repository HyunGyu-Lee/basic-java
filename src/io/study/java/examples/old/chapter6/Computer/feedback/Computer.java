package io.study.java.examples.old.chapter6.Computer.feedback;

public class Computer {

    private String name;
    private String monitorInfo;
    private ComputerBody computerBody;

    public Computer(String name, String monitorInfo, ComputerBody computerBody) {
        this.name = name;
        this.monitorInfo = monitorInfo;
        this.computerBody = computerBody;
    }

    public void boot() {
        System.out.println("입력하신 컴퓨터를 실행합니다.");
        System.out.println("[" + this.name + "]" + this.computerBody.getCpuInfo());
        System.out.println("display:" + this.monitorInfo);
        System.out.println("RAM:" + this.computerBody.getRamInfo() + "GB");
        System.out.println("DISK:" + this.computerBody.getDiskInfo() + "DISKSIZE:" + this.computerBody.getDiskSize());
    }

    /***
     * String 의 클래스 메소드(= static 메소드, = 정적 메소드) String.format 을 사용한 것
     */
    public void bootUsingStringFormat() {
        System.out.println("입력하신 컴퓨터를 실행합니다.");
        System.out.println(String.format("[%s] %s", this.name, this.computerBody.getCpuInfo()));
        System.out.println(String.format("[%s] %s", this.name, this.computerBody.getCpuInfo()));
        System.out.println(String.format("Display: %s", this.monitorInfo));
        System.out.println(String.format("RAM: %d GB", this.computerBody.getRamInfo()));
        System.out.println(String.format("DISK: %s, DISTSIZE: %d GB", this.computerBody.getDiskInfo(), this.computerBody.getDiskSize()));
    }


}


