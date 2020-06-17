package io.study.java.examples.old.computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.println("메모리 제조사를 입력하세요");
        String memoryManufactor = sc.nextLine();
        System.out.println("메모리 용량을 입력하세요.");
        int memorySize = sc.nextInt();
        sc.nextLine();
        System.out.println("스토리지 제조사를 입력하세요.");
        String storageManufactor = sc.nextLine();
        System.out.println("스토리지 타입을 입력하세요.");
        String storageType = sc.nextLine();


        Memory memory = new Memory(memoryManufactor,memorySize);
        Storage storage = new Storage(storageManufactor,storageType);
        Display display = new Display();
        Computer computer = new Computer(display,memory,storage);
        computer.booting();



    }
}
