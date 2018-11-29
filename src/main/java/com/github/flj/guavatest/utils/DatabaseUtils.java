package com.github.flj.guavatest.utils;

import com.github.flj.guavatest.config.ApplicationContextProvider;
import com.github.flj.guavatest.config.DataSourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/11/29     flj    ${添加描述}
 *
 * *********************************************
 * </pre>
 */

public class DatabaseUtils {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseUtils.class);
    private static DataSourceConfig dataSourceConfig = ApplicationContextProvider.getBean(DataSourceConfig.class);

    private static Connection con= null;
    private static Statement statement = null;

    private static final String DRIVER = "com.mysql.jdbc.Driver";

    /**
     * 连接数据库
     */
    public static Connection connect(){
        try{
            Class.forName(DRIVER);
            con = DriverManager.getConnection(dataSourceConfig.getUrl(),dataSourceConfig.getUsername(),dataSourceConfig.getPassword());
        }catch (Exception e){
            logger.error("connect database exception !",e);
        }
        return con;
    }

    /**
     * 关闭连接
     */
    public static void closeConnect() {
        try {
            if (con != null) {
                con.close();
                con = null;
            }
            if (statement != null) {
                statement.close();
                statement = null;
            }
        } catch (SQLException e) {
            logger.error("close connection exception!",e);
        }

    }

}
