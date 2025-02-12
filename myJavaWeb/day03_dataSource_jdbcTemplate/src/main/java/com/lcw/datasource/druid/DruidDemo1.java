package com.lcw.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Create by chuanwen.li on 2019/6/6
 */
public class DruidDemo1 {

    public static void main(String[] args) throws Exception {


        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件

        Properties pro = new Properties();
        InputStream is = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);

        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

        //5，获取连接
        Connection conn = dataSource.getConnection();

        System.out.println(conn);//com.mysql.jdbc.JDBC4Connection@60215eee


    }


}
