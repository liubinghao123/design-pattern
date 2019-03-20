package com.hao.decorator;

import com.hao.AbstractHaircut;

/**
 * 洗剪吹套餐
 */
public class ScissorsBlowingHaircut extends AbstractHaircut {
    private AbstractHaircut hc;
    public ScissorsBlowingHaircut(AbstractHaircut hc){
        this.hc = hc;

    }
    public String getMessage() {
        return hc.getMessage() + "，吹洗服务";
    }

    public int getPrice() {
        return hc.getPrice() + 20;
    }
}
