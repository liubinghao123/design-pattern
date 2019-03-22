package com.hao.methodfacotry;

/**
 * created by keeper at 2019-03-20
 */
public class MethodFactoryTest {
    public static void main(String[] args){
        ITClubFactory itClubFactory = new GPFactory();
        ITClubFactory itClubFactory2 = new CZFactory();
        ITClubFactory itClubFactory3 = new FKFactory();
        System.out.println("我在" + itClubFactory3.getName() + "学习java课程，课程名称：" + itClubFactory3.getJavaVip());
    }
}
