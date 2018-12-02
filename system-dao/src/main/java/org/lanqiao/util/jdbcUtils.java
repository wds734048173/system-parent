package org.lanqiao.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class jdbcUtils {

    // 配置文件的默认配置！要求你必须给出c3p0-config.xml！！！
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    //获取Connection
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    //获取Dateouces
    public static DataSource getDataSource() {
        return dataSource;
    }

}
