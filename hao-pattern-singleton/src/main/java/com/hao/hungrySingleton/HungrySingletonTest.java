package com.hao.hungrySingleton;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Keeper on 2019-03-22
 */
public class HungrySingletonTest {
   public static void main(String[] args){
       /**
        * 类加载就初始化对象，饿汉模式多的情况会造成大量的资源消耗
        */
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println("通过饿汉单例模式获取到的对象实例：" + hungrySingleton);

//        //通过反射攻击单例模式
//       Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
//       try {
//           Constructor constructor = hungrySingletonClass.getDeclaredConstructor();
//           constructor.setAccessible(true);
//           HungrySingleton hungrySingleton2 = (HungrySingleton) constructor.newInstance();
//           System.out.println("通过反射攻击创建饿汉单例模式下新的实例：" + hungrySingleton2);
//       } catch (Exception e) {
//           e.printStackTrace();
//       }

       //通过序列化攻击
       try {
           File file = new File("/Users/liubinghao/Documents/hungrySingleton.ser");
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(hungrySingleton);
           oos.close();

           FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis);
           HungrySingleton hungrySingleton2 = (HungrySingleton)ois.readObject();
           ois.close();
           System.out.println("通过序列化攻击创建饿汉单例模式下新的实例：" + hungrySingleton2);

       } catch (Exception e) {
           e.printStackTrace();
       }

   }
}
