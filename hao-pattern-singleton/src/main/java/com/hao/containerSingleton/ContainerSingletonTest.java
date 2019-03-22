package com.hao.containerSingleton;

/**
 * Created by Keeper on 2019-03-22
 */
public class ContainerSingletonTest {
    public static void main(String[] args){
       A a = (A) ContainerSingleton.getInstance("com.hao.containerSingleton.A");
       System.out.println(a);
    }
}
