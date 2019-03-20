package com.hao.decorator;

import com.hao.AbstractHaircut;

/**
 * 烫染套餐
 */
public class HotdyeHaircut extends AbstractHaircut {
    private AbstractHaircut hc;
    public HotdyeHaircut(AbstractHaircut hc){
        this.hc = hc;

    }
    public String getMessage() {
        return hc.getMessage() + "，烫染服务";
    }

    public int getPrice() {
        return hc.getPrice() + 200;
    }
}
