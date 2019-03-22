package com.hao.hungrySingleton;

import java.io.Serializable;

/**
 * Created by Keeper on 2019-03-22
 * 饿汉单例模式
 */
public class HungrySingleton implements Serializable {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public Object readResolve(){
        return hungrySingleton;
    }
}
