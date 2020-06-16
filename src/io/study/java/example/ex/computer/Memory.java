package io.study.java.example.ex.computer;

public class Memory {

    private String memoryManufactor;
    private int memorySize;

    public Memory(String memoryManufactor, int memorySize) {
        this.memoryManufactor = memoryManufactor;
        this.memorySize = memorySize;
    }

    public String getMoryManufactor() {
        return memoryManufactor;
    }

    public int getMemorySize() {
        return memorySize;
    }
}
