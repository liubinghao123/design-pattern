package com.hao.methodfacotry;

/**
 * created by keeper at 2019-03-20
 * it 俱乐部接口
 * 工厂接口化，由子类实现且实例化，不同的子类实现不同的内部逻辑
 */
public interface ITClubFactory {
    String getName();

    String getJavaVip();

}
