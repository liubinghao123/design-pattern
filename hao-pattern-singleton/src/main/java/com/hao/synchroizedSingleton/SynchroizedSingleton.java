package com.hao.synchroizedSingleton;

/**
 * Created by Keeper on 2019-03-22
 * 同步方法单例
 */
public class SynchroizedSingleton {
    private static SynchroizedSingleton synchroizedSingleton = null;

    private SynchroizedSingleton(){}

    public synchronized static SynchroizedSingleton getInstance(){
        if(synchroizedSingleton == null){
            synchroizedSingleton = new SynchroizedSingleton();
        }
        return synchroizedSingleton;
    }
}
