package org.lanqiao;


import java.sql.SQLException;
import java.util.List;

public interface ICustomerinfoDao {
    //查询所有客户信息
    public List<Customerinfo> selectAll() throws SQLException;
}
