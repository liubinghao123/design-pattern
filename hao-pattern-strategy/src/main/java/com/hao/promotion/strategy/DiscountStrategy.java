package com.hao.promotion.strategy;

/**
 * Created by Keeper on 2019-03-24
 * 打折优惠
 */
public class DiscountStrategy implements PromotionStrategy {
    public void execute() {
        System.out.println("打折优惠");
    }
}
