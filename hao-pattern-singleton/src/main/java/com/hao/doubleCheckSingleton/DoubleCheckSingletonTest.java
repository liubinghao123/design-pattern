package com.hao.doubleCheckSingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class DoubleCheckSingletonTest {
    public static void main(String[] args){
        /**
         * 懒汉型的单例模式
         * 通过双重检查+锁的方式很好的规避了多线程情况创建多个实例的问题
         * 但是不能天然规避反射攻击和序列化攻击
         */
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        System.out.println(doubleCheckSingleton);
    }
}
