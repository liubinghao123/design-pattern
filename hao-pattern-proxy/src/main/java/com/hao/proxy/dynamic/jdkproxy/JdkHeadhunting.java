package com.hao.proxy.dynamic.jdkproxy;

import java.io.ObjectInput;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Keeper on 2019-03-23
 * 使用JDK动态代理为程序员找工作
 */
public class JdkHeadhunting implements  InvocationHandler {
    private Object target;
    public Object getInstance(Object target){
       this.target = target;
       Class<?> clazz = target.getClass();
       return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    /**
     * @param proxy 代理对象
     * @param method 被代理需要执行的动作
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你的能力很出众，我帮你看看");
        System.out.println("腾讯，阿里，百度都有面试机会");
        Object object = method.invoke(target,args);
        System.out.println("恭喜你三个都通过了");
        return object;
    }
}
