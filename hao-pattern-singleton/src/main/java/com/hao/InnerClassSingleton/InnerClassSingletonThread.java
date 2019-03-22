package com.hao.InnerClassSingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class InnerClassSingletonThread implements Runnable {
    public void run() {
        System.out.println(InnerClassSingleton.getInstance());
    }
}
