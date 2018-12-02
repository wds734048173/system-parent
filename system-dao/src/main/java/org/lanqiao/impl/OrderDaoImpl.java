package org.lanqiao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.lanqiao.IOrderDao;
import org.lanqiao.Order;
import org.lanqiao.util.jdbcUtils;

import java.sql.SQLException;
import java.util.List;

public class OrderDaoImpl implements IOrderDao {

    private QueryRunner qr = new QueryRunner(jdbcUtils.getDataSource());

    public List<Order> getOrderList() {
        String sql = "select * from tb_order";
        List<Order> orderList = null;
        try {
            orderList = qr.query(sql, new BeanListHandler<Order>(Order.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderList;
    }
}
