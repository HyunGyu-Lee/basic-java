package io.study.java.example.ex.computer;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLService;

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
        Display display = new Display();
        display.storage(storage.getStorageManufactor(), storage.getStorageType());
        display.memory(memory.getMoryManufactor(), memory.getMemorySize());

    }


}
