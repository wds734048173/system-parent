package org.lanqiao;

import org.junit.Test;
import org.lanqiao.impl.CustomerinfoDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerinfoTest {
    @Test
    public void selectAllTest() throws SQLException {
        ICustomerinfoDao iCustomerinfoDao = new CustomerinfoDaoImpl();
        List<Customerinfo> customerinfoList = iCustomerinfoDao.selectAll();
        for (Customerinfo customerinfo:customerinfoList){
            System.out.println(customerinfo);
        }
    }
}
