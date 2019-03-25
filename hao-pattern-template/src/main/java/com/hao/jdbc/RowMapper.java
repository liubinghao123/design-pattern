package com.hao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Keeper on 2019-03-25
 */
public  abstract class RowMapper<T> {
    abstract T rowMapper(ResultSet rs) throws SQLException;
}
