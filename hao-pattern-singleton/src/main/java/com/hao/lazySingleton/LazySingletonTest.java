package com.hao.lazySingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class LazySingletonTest {
    public static void main(String[] args){
        //在多线程模式下会三种情况
        /**
         * 1: 只创建一个实例
         * 2：创建两个实例
         * 3：创建两个实例，但是由于jvm将静态变量的引用到对象内存中被线程2覆盖了，所以最后给出一个实例的假象
         */
        Thread t1 = new Thread(new LazySingletonThread());
        Thread t2 = new Thread(new LazySingletonThread());
        t1.start();
        t2.start();
    }
}
