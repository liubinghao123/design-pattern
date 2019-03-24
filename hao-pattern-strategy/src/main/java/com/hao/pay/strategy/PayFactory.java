package com.hao.pay.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keeper on 2019-03-24
 */
public class PayFactory {
    private static final Map<String,PaymentStrategy> map = new HashMap<String,PaymentStrategy>();

    static{
        map.put("alipay",new Alipay());
        map.put("wechatpay",new WechatPay());
        map.put("unionpay",new UnionPay());
    }

    public static PaymentStrategy getPaymentStrategy(String payment){
        PaymentStrategy paymentStrategy = map.get(payment);
        return paymentStrategy == null ? map.get("alipay") : paymentStrategy;
    }
}
