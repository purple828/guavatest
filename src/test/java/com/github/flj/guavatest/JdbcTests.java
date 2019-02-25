package com.github.flj.guavatest;

import com.alibaba.fastjson.JSON;
import com.github.flj.guavatest.config.DataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2019/2/25     flj    ${添加描述}
 *
 * *********************************************
 * </pre>
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JdbcTests {

    @Resource
    private DataSourceConfig dataSourceConfig;
    @Test
    public void connectTest(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if(null == dataSourceConfig){
                System.out.println("-----------null-----------");
            }
            Connection connection = DriverManager.getConnection(dataSourceConfig.getUrl(),dataSourceConfig.getUsername(),dataSourceConfig.getPassword());
            Statement statement = connection.createStatement();
            String sql = "select * from bb_flower_goods";
            ResultSet set = statement.executeQuery(sql);
//            System.out.println("----------->"+JSON.toJSONString(set));
            AtomicInteger count = new AtomicInteger();
            while (set.next()){
                Integer id = set.getInt("id");
                System.out.println("*********"+id);
                count.getAndIncrement();
            }
            System.out.println("------------->"+count);


        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
