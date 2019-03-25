package com.hao.jdbc;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Keeper on 2019-03-25
 */
public class UserService {
    private UserDao userDao;
    public List<User> queryList(String sql, Object[] params) throws SQLException {
        return userDao.queryList(sql,params);
    }
}
