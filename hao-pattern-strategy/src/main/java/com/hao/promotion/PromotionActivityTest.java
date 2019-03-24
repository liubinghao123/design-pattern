package com.hao.promotion;

/**
 * Created by Keeper on 2019-03-24
 */
public class PromotionActivityTest {
    public static void main(String[] args){
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getStrategy("discount"));
        promotionActivity.execute();
    }
}
