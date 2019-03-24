package com.hao.pay;

/**
 * Created by Keeper on 2019-03-24
 */
public class PaymentService implements IPaymentService {
    public PayResult pay(PaymentVo vo) {
        if(vo.getPayType().equals("alipay")){
            System.out.println("使用支付宝支付");
        }else if(vo.getPayType().equals("wechatpay")){
            System.out.println("使用微信支付");
        }else if(vo.getPayType().equals("unionpay")){
            System.out.println("使用银联支付");
        }
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
