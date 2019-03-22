package com.hao.lazySingleton;

/**
 * Created by Keeper on 2019-03-22
 * 懒汉单例模式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
