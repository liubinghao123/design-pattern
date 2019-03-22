package com.hao.EnumSingleton;

import com.hao.hungrySingleton.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by Keeper on 2019-03-22
 */
public class EnumSingletonTest {
   public static void main(String[] args){
       /**
        * 天然规避反射攻击和序列化攻击
        */

        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        System.out.println("通过枚举单例模式获取到的对象实例：" + enumSingleton.hashCode());

        //通过反射攻击单例模式
       Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
       try {
           Constructor constructor = enumSingletonClass.getDeclaredConstructor(String.class,int.class);
           constructor.setAccessible(true);
           EnumSingleton enumSingleton2 = (EnumSingleton) constructor.newInstance();
           System.out.println("通过反射攻击创建枚举单例模式下新的实例：" + enumSingleton2);
       } catch (Exception e) {
           e.printStackTrace();
       }
//
       //通过序列化攻击
       try {
           File file = new File("/Users/liubinghao/Documents/EnumSingleton.ser");
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(enumSingleton);
           oos.close();

           FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis);
           EnumSingleton enumSingleton2 = (EnumSingleton)ois.readObject();
           ois.close();
           System.out.println("通过序列化攻击创建枚举单例模式下新的实例：" + enumSingleton2.hashCode());

       } catch (Exception e) {
           e.printStackTrace();
       }

   }
}
