package org.lanqiao;

import java.sql.SQLException;
import java.util.List;

public interface IManagerDao {
    //查询所有管理员信息
    public List<Manager> selectAll() throws SQLException;
}
