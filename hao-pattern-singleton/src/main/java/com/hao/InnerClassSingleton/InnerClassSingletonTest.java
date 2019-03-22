package com.hao.InnerClassSingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class InnerClassSingletonTest {
    public static void main(String[] args){
        /**
         * 通过JVM底层的类加载顺序巧妙骚气的多线程情况下创建多个实例的问题
         * 不需要加锁，性能比doublecheck要好
         * 但是还是无法规避反射和序列化的攻击
         */
        Thread t1 = new Thread(new InnerClassSingletonThread());
        Thread t2 = new Thread(new InnerClassSingletonThread());
        t1.start();
        t2.start();
    }
}
