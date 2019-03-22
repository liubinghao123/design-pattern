package com.hao.InnerClassSingleton;

/**
 * Created by Keeper on 2019-03-22
 * 内部类单例
 */
public class InnerClassSingleton {
    private static InnerClassSingleton innerClassSingleton = null;
    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return InnerClass.get();
    }

    private static class InnerClass{
       static{
           if(innerClassSingleton == null){
               innerClassSingleton = new InnerClassSingleton();
           }
       }
       public static InnerClassSingleton get(){
           return innerClassSingleton;
       }
    }
}
