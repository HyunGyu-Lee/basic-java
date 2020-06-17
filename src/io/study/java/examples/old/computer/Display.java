package io.study.java.examples.old.computer;

public class Display {
    public Display(){

    }

    public Memory memory(Memory memory){
        System.out.println(String.format("메모리 용량 : %s,메모리 제조사 : %s",memory.getMemorySize(),memory.getMoryManufactor()));
        return memory;
    }

    public Storage storage(Storage storage){
        System.out.println(String.format("디스크 타입 : %s,디스크 제조사 : %s",storage.getStorageType(),storage.getStorageManufactor()));
        return storage;

    }



}
