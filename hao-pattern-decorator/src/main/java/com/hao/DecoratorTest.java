package com.hao;

import com.hao.decorator.HotdyeHaircut;
import com.hao.decorator.ScissorsBlowingHaircut;

/**
 * 装饰者设计模式-测试
 */
public class DecoratorTest {
       public static void main(String[] args){
           //选择单剪服务
           AbstractHaircut hc = new DefaultHaircut();

           //加入洗吹服务
           ScissorsBlowingHaircut sbHc = new ScissorsBlowingHaircut(hc);

           //加入烫染服务
           HotdyeHaircut hdHc = new HotdyeHaircut(sbHc);

           //结账
           System.out.println("您总共消费如下服务： " + hdHc.getMessage() + ";总共的消费金额为：" +  hdHc.getPrice());

       }
}
