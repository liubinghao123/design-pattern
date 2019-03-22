package com.hao.deep;

import com.hao.simple.Client;
import com.hao.simple.Prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Keeper on 2019-03-22
 */
public class DeepCloneTest {
    public static void main(String[] args){
        SuperTeacher superTeacher = new SuperTeacher();
        superTeacher.setAge(10);
        superTeacher.setName("jack");
        List<?> hobbies = new ArrayList();
        superTeacher.setHobbies(hobbies);

        Certificate certificate = new Certificate();
        certificate.setName("高级教师证书");
        certificate.setContent("非常棒");
        certificate.setDate(new Date());
        superTeacher.setCertificate(certificate);

        Client client = new Client();
        SuperTeacher superTeacher2 = (SuperTeacher)client.clone(superTeacher);

        System.out.println("superTeacher 的内存地址： " + superTeacher.hashCode());
        System.out.println("superTeacher2 的内存地址： " + superTeacher2.hashCode());

        System.out.println("superTeacher 引用类型[证书]的内存地址：" + superTeacher.getCertificate().hashCode());
        System.out.println("superTeacher2 引用类型[证书]的内存地址：" + superTeacher2.getCertificate().hashCode());

        System.out.println("superTeacher 引用类型[爱好]的内存地址：" + superTeacher.getHobbies());
        System.out.println("superTeacher2 引用类型[爱好]的内存地址：" + superTeacher2.getHobbies());

        System.out.println(superTeacher.getHobbies() == superTeacher2.getHobbies());
    }
}
