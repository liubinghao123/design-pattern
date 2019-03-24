package com.hao.proxy.simple.datasource;

import java.util.Date;

/**
 * Created by Keeper on 2019-03-23
 */
public class DynamicChangeDataSourceTest {
    public static void main(String[] args){
        User user = new User();
        user.setName("jack");
        user.setAge(10);
        user.setCreateTime(new Date());
        //使用UserStaticProxyService增强UserService save功能
        IUserService userService =  new UserStaticProxyService(new UserService());
        userService.save(user);
    }
}
