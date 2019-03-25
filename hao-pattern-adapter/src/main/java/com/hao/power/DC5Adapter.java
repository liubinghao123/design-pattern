package com.hao.power;

/**
 * Created by Keeper on 2019-03-25
 */
public class DC5Adapter implements DC5{
    private AC220 ac220;

    public DC5Adapter(AC220 ac220){
        this.ac220 = ac220;
    }

    public void output() {
        int power = this.ac220.getPower() / 44;
        System.out.println("将220V的交流电转换为"+power+"V");
    }
}
