package com.hao.containerSingleton;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Keeper on 2019-03-22
 * 容器单例
 */
public class ContainerSingleton {
    private static ContainerSingleton containerSingleton = null;
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton(){}

    public static Object getInstance(String className){
        synchronized (className) {
            if (!ioc.containsKey(className)) {
                try {
                    Class<?> clazz = Class.forName(className);
                    Constructor c = clazz.getDeclaredConstructor();
                    c.setAccessible(true);
                    Object obj = c.newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return ioc.get(className);
    }
}
