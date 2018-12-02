package org.lanqiao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.lanqiao.IManagerDao;
import org.lanqiao.Manager;
import org.lanqiao.util.jdbcUtils;

import java.sql.SQLException;
import java.util.List;

public class ManagerDaoImpl implements IManagerDao {
    private QueryRunner qr = new QueryRunner(jdbcUtils.getDataSource());
    @Override
    public List<Manager> selectAll() throws SQLException {
        String sql = "select * from tb_manager";
        qr.query(sql,new BeanListHandler<>(Manager.class));
        return qr.query(sql,new BeanListHandler<>(Manager.class));
    }
}
