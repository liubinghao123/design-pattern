package com.hao.lazySingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class LazySingletonThread implements Runnable {
    public void run() {
        System.out.println(LazySingleton.getInstance());
    }
}
