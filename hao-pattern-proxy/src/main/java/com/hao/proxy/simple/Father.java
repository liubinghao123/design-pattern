package com.hao.proxy.simple;

/**
 * Created by Keeper on 2019-03-23
 * 静态代理类 为目标对象做增强处理 代理儿子找对象
 */
public class Father implements Person {
    private Person person;
    public Father(Person person){
        this.person = person;
    }
    public void findLove() {
        System.out.println("请说出你的要求");
        this.person.findLove();
        System.out.println("已物色到对象，是否同意见面");
    }
}
