package com.hao.threadLocalSingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class ThreadLocalSingleton {
    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        System.out.println(threadLocal.get());
        return threadLocal.get();
    }
}
