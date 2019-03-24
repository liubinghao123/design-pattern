package com.hao.promotion.strategy;

/**
 * Created by Keeper on 2019-03-24
 * 满减活动
 */
public class EnoughSubStrategy implements PromotionStrategy {
    public void execute() {
        System.out.println("满减优惠");
    }
}
