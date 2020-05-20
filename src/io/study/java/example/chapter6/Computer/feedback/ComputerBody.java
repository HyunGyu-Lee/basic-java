package io.study.java.example.chapter6.Computer.feedback;

public class ComputerBody {
    private String cpuInfo;
    private int ramInfo;
    private String diskInfo;
    private int diskSize;

    public ComputerBody(String cpuInfo, int ramInfo, String diskInfo, int diskSize) {
        this.cpuInfo = cpuInfo;
        this.ramInfo = ramInfo;
        this.diskSize = diskSize;

        if (diskInfo.equals("H")) {
            this.diskInfo = "HDD";
        } else if (diskInfo.equals("S")) {
            this.diskInfo = "SDD";
        }
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    public int getRamInfo() {
        return ramInfo;
    }

    public String getDiskInfo() {
        return diskInfo;
    }

    public int getDiskSize() {
        return diskSize;
    }
}


