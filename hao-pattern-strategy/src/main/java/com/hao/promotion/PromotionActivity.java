package com.hao.promotion;

import com.hao.promotion.strategy.PromotionStrategy;

/**
 * Created by Keeper on 2019-03-24
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.execute();
    }
}
