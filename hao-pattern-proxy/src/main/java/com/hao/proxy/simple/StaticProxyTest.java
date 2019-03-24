package com.hao.proxy.simple;

/**
 * Created by Keeper on 2019-03-23
 * 静态代理须持有被代理对象的引用，使用简单
 * 代理对象少
 */
public class StaticProxyTest {
    public static void main(String[] args){
        Father father = new Father(new Son());
        father.findLove();
    }
}
