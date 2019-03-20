package com.hao;

import com.hao.factory.Factory;
import com.hao.factory.FactoryA;
import com.hao.factory.FactoryB;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Department {
    private  Map<String, Factory> register = new HashMap<String,Factory>();
    {
        register.put("芯片",new FactoryA());
        register.put("屏幕",new FactoryB());
    }
    public  void doing(String command){
        register.get(command).doing();
    }
}
