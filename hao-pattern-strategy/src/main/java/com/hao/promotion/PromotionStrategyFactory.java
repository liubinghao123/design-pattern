package com.hao.promotion;

import com.hao.promotion.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keeper on 2019-03-24
 */
public class PromotionStrategyFactory {
    private PromotionStrategyFactory promotionStrategyFactory = new PromotionStrategyFactory();
    private static final Map<String, PromotionStrategy> map = new HashMap<String, PromotionStrategy>();

    private PromotionStrategyFactory(){}

    static{
        map.put("cashBack",new CashBackStrategy());
        map.put("discount",new DiscountStrategy());
        map.put("EnoughSub",new EnoughSubStrategy());
        map.put("default",new DefaultStrategy());
    }

    public static PromotionStrategy getStrategy(String strategyName){
       return map.containsKey(strategyName) ? map.get(strategyName) : map.get("default");
    }

}
