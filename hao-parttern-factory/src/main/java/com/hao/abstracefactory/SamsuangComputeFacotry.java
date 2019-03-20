package com.hao.abstracefactory;

/**
 * Created by keeper at 2019-03-20
 */
public class SamsuangComputeFacotry implements  ComputeFactory{
    public String getName() {
        return "三星电脑";
    }

    public Cpu getCpu() {
        return new IntelCpu();
    }

    public Disk getDisk() {
        return new SamsuangDisk();
    }

    public Memory getMemory() {
        return new SamsuangMemory();
    }
}
