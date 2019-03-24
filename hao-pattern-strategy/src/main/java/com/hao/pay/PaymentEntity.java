package com.hao.pay;

import java.util.Date;

/**
 * Created by Keeper on 2019-03-24
 */
public class PaymentEntity {
    private String payType;
    private Date createDate;
    private Integer price;
    private String no;//流水号

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
