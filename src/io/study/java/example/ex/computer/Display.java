package io.study.java.example.ex.computer;

import com.sun.org.apache.xml.internal.utils.StopParseException;

public class Display {
    public Display(){

    }

    public Memory memory(String manufactor, int memorySize){
        Memory memory = new Memory(manufactor,memorySize);
        System.out.println(String.format("메모리 용량 : %s,메모리 제조사 : %s",memory.getMemorySize(),memory.getMoryManufactor()));
        return memory;
    }

    public Storage storage(String storageManufactor, String storageType){
        Storage storage = new Storage(storageManufactor,storageType);
        System.out.println(String.format("디스크 타입 : %s,디스크 제조사 : %s",storage.getStorageType(),storage.getStorageManufactor()));
        return storage;

    }



}
