package org.lanqiao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.lanqiao.Customerinfo;
import org.lanqiao.ICustomerinfoDao;
import org.lanqiao.util.jdbcUtils;

import java.sql.SQLException;
import java.util.List;

public class CustomerinfoDaoImpl implements ICustomerinfoDao {
    private QueryRunner qr = new QueryRunner(jdbcUtils.getDataSource());
    @Override
    public List<Customerinfo> selectAll() throws SQLException {
        String sql = "select * from tb_customerinfo";
        return  qr.query(sql,new BeanListHandler<>(Customerinfo.class));
    }
}
