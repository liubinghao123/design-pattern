package com.hao.synchroizedSingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class SynchroizedSingletonTest {
    public static void main(String[] args){
        /**
         * 如果对象创建时间较长，多线程情况容易造成死锁
         */
        SynchroizedSingleton synchroizedSingleton = SynchroizedSingleton.getInstance();
        System.out.println(synchroizedSingleton);

    }
}
