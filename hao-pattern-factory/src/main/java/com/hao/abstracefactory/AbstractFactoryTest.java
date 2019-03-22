package com.hao.abstracefactory;

/**
 * Created by keeper at 2019-03-20
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        ComputeFactory computeFactory = new SamsuangComputeFacotry();
        System.out.println(computeFactory.getName()+"\n-----------------------------");
        System.out.println("cpu 牌子" + computeFactory.getCpu().getBrand());
        System.out.println("硬盘 牌子" + computeFactory.getDisk().getBrand());
        System.out.println("内存 牌子" + computeFactory.getMemory().getBrand());
    }
}
