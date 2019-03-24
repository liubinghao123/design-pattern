package com.hao.proxy.simple.datasource;

/**
 * Created by Keeper on 2019-03-23
 */
public class UserService implements IUserService{
    private UserDao userDao = new UserDao();
    public void save(User user){
        userDao.save(user);
    }
}
