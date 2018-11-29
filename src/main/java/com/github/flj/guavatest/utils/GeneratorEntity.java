package com.github.flj.guavatest.utils;

import com.github.flj.guavatest.config.ApplicationContextProvider;
import com.github.flj.guavatest.config.DataSourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.Collection;
import java.util.PrimitiveIterator;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/11/29     flj    根据数据库表生成实体类
 *
 * *********************************************
 * </pre>
 */

public class GeneratorEntity {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private Connection con= null;
    private Statement statement = null;
    private ResultSet rs = null;
    private ResultSetMetaData rsmd = null;

    private String[] tableNames;
    private String[] colnames; // 列名数组
    private String[] colTypes; // 列名类型数组
    private int[] colSizes; // 列名大小数组
    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*

    private DataSourceConfig dataSourceConfig = ApplicationContextProvider.getBean(DataSourceConfig.class);

    /**
     * 连接数据库
     */
    private void connect(){
        try{
            Class.forName(DRIVER);
            con = DriverManager.getConnection(dataSourceConfig.getUrl(),dataSourceConfig.getUsername(),dataSourceConfig.getPassword());
            statement = con.createStatement();

        }catch (Exception e){
            logger.error("connect database exception !",e);
        }

    }

    /**
     * 关闭连接
     */
    private void closeConnect() {
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

    private void getAllTables(){
        String sql = "SELECT TABLE_NAME FROM USER_TABLES";
        try{
            rs = statement.executeQuery(sql);
            StringBuilder sb = new StringBuilder();
            while (rs.next()){
                sb.append(rs.getString("TABLE_NAME")).append(",");
            }
            tableNames = sb.toString().substring(0,sb.length()-1).split(",");
            for(String tableName:tableNames){
                getTableInfo(tableName);
            }

        }catch (Exception e){
            logger.error("get all tablename exception !",e);
        }finally {
            closeConnect();
        }

    }


    private void getTableInfo(String tableName){
        int size = 0;
        String sql = "select * from "+tableName;
        try{
            rs = statement.executeQuery(sql);
            rsmd = rs.getMetaData();
            size = rsmd.getColumnCount();
            colnames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];
            for(int i=0;i<size;i++){
                colnames[i] = rsmd.getColumnName(i+1);
                colTypes[i] = rsmd.getColumnTypeName(i+1);
                if(colTypes[i].equalsIgnoreCase("date") || colTypes[i].equalsIgnoreCase("timestamp")){
                    f_util = true;
                }
                if (colTypes[i].equalsIgnoreCase("blob")
                        || colTypes[i].equalsIgnoreCase("char")) {
                    f_sql = true;
                }
                colSizes[i] = rsmd.getColumnDisplaySize(i+1);
            }
            //规范化表名
            String normTableName = normTableName(tableName);


        }catch (Exception e){

        }



    }


    private String normTableName(String tableName){
        String result = "";
//        for(String temp:)
        return null;

    }



}
