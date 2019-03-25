package com.hao.power;

/**
 * Created by Keeper on 2019-03-25
 */
public class PowerAdapterTest {
    public static void main(String[] args){
        DC5 dc5 = new DC5Adapter(new AC220());
        dc5.output();
    }
}