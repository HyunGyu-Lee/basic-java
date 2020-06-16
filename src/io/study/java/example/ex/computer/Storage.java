package io.study.java.example.ex.computer;

public class Storage {
    private String storageManufactor;
    private String storageType;

    public Storage(String storageManufactor, String storageType) {
        this.storageManufactor = storageManufactor;
        this.storageType = storageType;
    }

    public String getStorageManufactor() {
        return storageManufactor;
    }

    public String getStorageType() {
        return storageType;
    }
}
