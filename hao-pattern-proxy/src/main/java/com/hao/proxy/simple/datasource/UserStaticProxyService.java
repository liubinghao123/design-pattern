package com.hao.proxy.simple.datasource;

import java.util.Calendar;

/**
 * Created by Keeper on 2019-03-23
 */
public class UserStaticProxyService implements IUserService {
    private Calendar calendar  = Calendar.getInstance();
    private UserDao userDao = new UserDao();
    private IUserService userService;

    public UserStaticProxyService(IUserService userService){
        this.userService = userService;
    }

    /**
     * 根据用户的创建时间去动态结婚数据源
     * 分表分库，单位年
     * @param user
     */
    public void save(User user) {
        calendar.setTime(user.getCreateTime());
        int year = calendar.get(Calendar.YEAR);
        userDao.set(year+"");
        userService.save(user);
        userDao.reset();
    }
}
