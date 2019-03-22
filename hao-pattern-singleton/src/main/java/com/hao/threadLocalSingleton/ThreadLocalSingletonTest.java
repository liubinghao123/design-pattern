package com.hao.threadLocalSingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args){
        /**
         * 同一条线程只保证同一个对象实例
         * 不同线程存在不同的实例，伪单例
         */
        ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton.getInstance();
        new Thread(){
            @Override
            public void run() {
               ThreadLocalSingleton.getInstance();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                ThreadLocalSingleton.getInstance();
            }
        }.start();

    }
}
