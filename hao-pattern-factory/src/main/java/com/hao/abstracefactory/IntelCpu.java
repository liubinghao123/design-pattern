package com.hao.abstracefactory;

/**
 * Created by keeper at 2019-03-20
 */
public class IntelCpu implements  Cpu {
    public String getBrand() {
        return "AMD";
    }

    public int getPrice() {
        return 1999;
    }
}
