package com.hao.abstracefactory;

/**
 * 电脑零配件抽象工厂
 */
public interface ComputeFactory {
    String getName();
    Cpu getCpu();

    Disk getDisk();

    Memory getMemory();
}
