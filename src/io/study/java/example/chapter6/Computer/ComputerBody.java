package io.study.java.example.chapter6.Computer;

public class ComputerBody {
    private String cpuinfo;
    private int raminfo;
    private String diskinfo;
    private int disksize;

    public ComputerBody(String cpuinfo, int raminfo, String diskinfo, int disksize) {

        this.cpuinfo = cpuinfo;
        this.raminfo = raminfo;
        this.diskinfo = diskinfo;
        this.disksize = disksize;

    }


    public String getCpuinfo() {
        return cpuinfo;
    }

    public int getRaminfo() {
        return raminfo;
    }

    public String getDiskinfo() {
        if(diskinfo =="h"){
            diskinfo = "HDD";
        }
        else{
            diskinfo = "SSD";
        }
        return diskinfo;
    }

    public int getDisksize() {
        return disksize;
    }
}


