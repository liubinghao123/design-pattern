package com.hao.pay.strategy;

/**
 * Created by Keeper on 2019-03-24
 */
public class WechatPay implements PaymentStrategy {
    public void execute() {
        System.out.println("使用微信支付");
    }
}
