package com.hao.pay.strategy;

import com.hao.pay.IPaymentService;
import com.hao.pay.PayResult;
import com.hao.pay.PaymentEntity;
import com.hao.pay.PaymentVo;

/**
 * Created by Keeper on 2019-03-24
 */
public class Payment2Service implements IPaymentService {
    public PayResult pay(PaymentVo vo) {
        PaymentStrategy paymentStrategy = PayFactory.getPaymentStrategy(vo.getPayType());
        paymentStrategy.execute();

        PaymentEntity payment = new PaymentEntity();
        payment.setCreateDate(vo.getCreataDate());
        payment.setNo("1234456");
        payment.setPayType(vo.getPayType());
        payment.setPrice(vo.getPrice());

        PayResult result = new PayResult();
        result.setConent("支付成功");
        result.setIsSuccess(1);
        return result;
    }
}
