package com.hao.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keeper on 2019-03-25
 */
public class UserDao extends JdbcTemplate {
    public UserDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<User> queryList(String sql, Object[] params) throws SQLException {
       return queryList(sql, params, new RowMapper<User>() {
           @Override
           User rowMapper(ResultSet rs) throws SQLException {
                 User user = new User();
                 user.setName(rs.getString("name"));
                 user.setAge(rs.getInt("age"));
                 return user;
           };
       });
    }
}
