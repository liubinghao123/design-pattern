package com.hao.jdbc;

import java.sql.SQLException;

/**
 * Created by Keeper on 2019-03-25
 */
public class JdbcTemplateTest {
    public static void main(String[] args) throws SQLException {
        User user = new User();
        user.setName("jack");
        user.setAge(10);
        UserService userService = new UserService();
        userService.queryList("select * from t_user where name = ? ",new Object[]{"jack"});
    }
}
