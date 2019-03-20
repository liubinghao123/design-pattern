package com.hao.abstracefactory;

/**
 * Created by keeper at 2019-03-20
 */
public class AmdCpu implements  Cpu {
    public String getBrand() {
        return "金士顿";
    }

    public int getPrice() {
        return 1999;
    }
}
