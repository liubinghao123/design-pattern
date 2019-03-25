package com.hao.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keeper on 2019-03-25
 */
public abstract class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public <T> List<T> queryList(String sql,Object[] params, RowMapper<T> rowMapper) throws SQLException {
        //1:获取连接
        Connection connection = getConnection();
        //2:获取到preparedStatement语句集
        PreparedStatement pstm = connection.prepareStatement(sql);
        //3:执行语句集
        ResultSet rs = executeQuery(pstm,params);
        //4:处理结果集

        List<T> results = preparedResult(rs,rowMapper);
        //5:关闭
        closePreparedStatement(pstm);
        closeConnetion(connection);
        return results;
    }

    protected <T> List<T> preparedResult(ResultSet rs,RowMapper<T> rowMapper) throws SQLException {
        List<T> results = new ArrayList<T>();
        while(rs.next()){
            results.add(rowMapper.rowMapper(rs));
        }
        return results;
    }

    protected Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    protected PreparedStatement getPreparedStatement(Connection connection,String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    protected ResultSet executeQuery(PreparedStatement preparedStatement,Object[] params) throws SQLException {
        for (int i = 0; i <params.length ; i++) {
            preparedStatement.setObject(i,params[i]);
        }
       return preparedStatement.executeQuery();
    }
    protected void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    protected void closeConnetion(Connection connection) throws SQLException {
        connection.close();
    }

}
