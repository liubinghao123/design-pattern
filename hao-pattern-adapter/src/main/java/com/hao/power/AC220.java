package com.hao.power;

/**
 * Created by Keeper on 2019-03-25
 */
public class AC220 {
    private Integer power = 220;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void output(){
        System.out.println("输出" + this.power + "V电流");
    }
}
