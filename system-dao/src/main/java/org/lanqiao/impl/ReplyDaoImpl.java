package org.lanqiao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.lanqiao.IReplyDao;
import org.lanqiao.Reply;
import org.lanqiao.util.jdbcUtils;

import java.sql.SQLException;
import java.util.List;

public class ReplyDaoImpl implements IReplyDao {
    private QueryRunner qr = new QueryRunner(jdbcUtils.getDataSource());
    public List<Reply> getReplyList() {
        String sql = "select * from tb_reply";
        List<Reply> orderList = null;
        try {
            orderList = qr.query(sql, new BeanListHandler<Reply>(Reply.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderList;
    }
}
