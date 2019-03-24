package com.hao.promotion.strategy;

/**
 * Created by Keeper on 2019-03-24
 * 返现金活动
 */
public class CashBackStrategy implements PromotionStrategy {
    public void execute() {
        System.out.println("现金返回优惠");
    }
}
