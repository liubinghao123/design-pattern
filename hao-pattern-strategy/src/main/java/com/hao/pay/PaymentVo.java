package com.hao.pay;

import java.util.Date;

/**
 * Created by Keeper on 2019-03-24
 */
public class PaymentVo {
    private String payType;
    private Date creataDate;
    private Integer price;

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getCreataDate() {
        return creataDate;
    }

    public void setCreataDate(Date creataDate) {
        this.creataDate = creataDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
