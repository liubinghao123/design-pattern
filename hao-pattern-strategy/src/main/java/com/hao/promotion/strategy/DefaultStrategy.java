package com.hao.promotion.strategy;

/**
 * Created by Keeper on 2019-03-24
 * 返现金活动
 */
public class DefaultStrategy implements PromotionStrategy {
    public void execute() {
        System.out.println("无优惠明细");
    }
}
