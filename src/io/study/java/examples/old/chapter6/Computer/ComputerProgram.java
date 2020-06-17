package io.study.java.examples.old.chapter6.Computer;

import java.util.Scanner;

public class ComputerProgram {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("기본 입력을 시작합니다.");
        System.out.println("컴퓨터 명을 입력 하세요.");
        String name = sc.nextLine();

        System.out.println("모니터 정보를 입력 하세요.");
        String mtinfo = sc.nextLine();

        System.out.println("CPU정보를 입력하세요.");
        String cpuinfo = sc.nextLine();

        System.out.println("RAM정보를 입력하세요.");
        int raminfo = sc.nextInt();

        sc.nextLine();

        System.out.println("디스크 타입을 입력하세요. (HDD:H, SSD:S)");
        String diskinfo = sc.nextLine();

        System.out.println("디스크의 크기를 입력하세요.");
        int disksize = sc.nextInt();


        ComputerBody pc1 = new ComputerBody(cpuinfo, raminfo, diskinfo, disksize);

        System.out.println("입력하신 컴퓨터를 실행합니다.");
        System.out.println("[" + name + "]" + pc1.getCpuinfo());
        System.out.println("display:" + mtinfo);
        System.out.println("RAM:" + pc1.getRaminfo() + "GB");
        System.out.println("DISK:" + pc1.getDiskinfo() + "  DISKSIZE:" + pc1.getDisksize()+"GB");


    }

}
