package com.hao.pay.strategy;

/**
 * Created by Keeper on 2019-03-24
 */
public class UnionPay implements PaymentStrategy {
    public void execute() {
        System.out.println("使用银联支付");
    }
}
