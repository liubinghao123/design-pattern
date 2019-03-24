package com.hao.proxy.simple.datasource;

/**
 * Created by Keeper on 2019-03-23
 */
public class UserDao {
    private static final ThreadLocal<String> local = new ThreadLocal<String>();
    public void save(User user){
        System.out.println("当前数据源为：" + local.get());
        System.out.println("用户保存成功！！！");
    }
    public static void set(String dataSource){
        local.set(dataSource);
    }

    public static void reset(){
        local.remove();
    }
}
