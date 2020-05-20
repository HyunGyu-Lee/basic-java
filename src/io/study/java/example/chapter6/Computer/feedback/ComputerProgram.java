package io.study.java.example.chapter6.Computer.feedback;

import java.util.Scanner;

public class ComputerProgram {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("기본 입력을 시작합니다.");
        System.out.println("컴퓨터 명을 입력 하세요.");
        String name = sc.nextLine();

        System.out.println("모니터 정보를 입력 하세요.");
        String monitorInfo = sc.nextLine();

        System.out.println("CPU정보를 입력하세요.");
        String cpuInfo = sc.nextLine();

        System.out.println("RAM정보를 입력하세요.");
        int ramInfo = sc.nextInt();

        sc.nextLine();

        System.out.println("디스크 타입을 입력하세요. (HDD:H, SSD:S)");
        String diskInfo = sc.nextLine();

        System.out.println("디스크의 크기를 입력하세요.");
        int diskSize = sc.nextInt();

        ComputerBody computerBody = new ComputerBody(cpuInfo, ramInfo, diskInfo, diskSize);

        Computer computer = new Computer(name, monitorInfo, computerBody);
        computer.boot();
        computer.bootUsingStringFormat();
    }

}
