package io.study.java.examples.old.computer;

public class Computer {

    private Display display;
    private Memory memory;
    private Storage storage;


    public Computer(Display display, Memory memory, Storage storage) {
        this.display = display;
        this.memory = memory;
        this.storage = storage;

    }

    public Display getDisplay() {

        return display;
    }

    public Memory getMemory() {

        return memory;
    }

    public Storage getStorage() {
        return storage;

    }

    public void booting() {
        System.out.println("부팅 되었습니다.");
        display.storage(this.storage);
        display.memory(this.memory);

    }


}
