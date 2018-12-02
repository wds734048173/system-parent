package org.lanqiao;

import org.junit.Test;
import org.lanqiao.impl.ManagerDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class ManagerTest {
    @Test
    public void selectAllTest() throws SQLException {
        IManagerDao iManagerDao = new ManagerDaoImpl();
        List<Manager> managerList = iManagerDao.selectAll();
        for (Manager manager:managerList){
            System.out.println(manager);
        }
    }
}
