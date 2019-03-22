package com.hao.abstracefactory;

/**
 * Created by keeper at 2019-03-20
 */
public class AcerComputeFacotry implements  ComputeFactory{
    public String getName() {
        return "acer电脑";
    }

    public Cpu getCpu() {
        return new AmdCpu();
    }

    public Disk getDisk() {
        return new KingstonDisk();
    }

    public Memory getMemory() {
        return new KingstonMemory();
    }
}
