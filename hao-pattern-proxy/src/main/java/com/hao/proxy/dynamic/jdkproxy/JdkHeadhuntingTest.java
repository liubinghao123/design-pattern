package com.hao.proxy.dynamic.jdkproxy;

import com.hao.proxy.dynamic.Coder;
import com.hao.proxy.dynamic.Person;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Keeper on 2019-03-23
 */
public class JdkHeadhuntingTest {
    public static void main(String[] args){
        try {
            Person person = (Person)new JdkHeadhunting().getInstance(new Coder());
            person.findJob();

            byte[] bs = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            ByteOutputStream bos = new ByteOutputStream();
            File file = new File("/Users/liubinghao/Documents/$Proxy0.class");

            FileOutputStream fos = new FileOutputStream(file);
            fos.write(bs);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
