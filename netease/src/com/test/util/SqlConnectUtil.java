package com.test.util;

import java.sql.*;

/**
 * Created by xiezuoyuan on 2018/4/1.
 */
public class SqlConnectUtil {

    public static String update(){
        //声明Connection对象

        Connection con;

        //驱动程序名

        String driver = "com.mysql.jdbc.Driver";

        //URL指向要访问的数据库名mydata

        String url = "jdbc:mysql://192.168.150.151:3306/xqy_test";

        //MySQL配置时的用户名

        String user = "root";

        //MySQL配置时的密码

        String password = "root123";

        //遍历查询结果集

        try {

            //加载驱动程序

            Class.forName(driver);

            //1.getConnection()方法，连接MySQL数据库！！

            con = DriverManager.getConnection(url, user, password);

            if (!con.isClosed())

                System.out.println("Succeeded connecting to the Database!");

            //2.创建statement类对象，用来执行SQL语句！！

            Statement statement = con.createStatement();

            //要执行的SQL语句

            StringBuilder stringBuilder = new StringBuilder();


            stringBuilder
                    .append(statement.executeUpdate("UPDATE gw_external_interface set url = 'https://gs.etax-gd.gov.cn/web-sbzs/nssb/sbqc/resetsbqc.do' where type = 'FR' and area_code = '440000'"))
                    .append(statement.executeUpdate("UPDATE gw_external_interface set url = 'https://gs.etax-gd.gov.cn/web-sbzs/nssb/sbqc/sburl.do' where type = 'FD' and area_code = '440000'"))
                    ;

            statement.close();

            con.close();

            return stringBuilder.toString();



        } catch (ClassNotFoundException e) {

            //数据库驱动类异常处理

            System.out.println("Sorry,can`t find the Driver!");

            e.printStackTrace();

        } catch (SQLException e) {

            //数据库连接失败异常处理

            e.printStackTrace();

        } catch (Exception e) {

            // TODO: handle exception

            e.printStackTrace();

        }

        return "";
    }
    public static String update2(){
        //声明Connection对象

        Connection con;

        //驱动程序名

        String driver = "com.mysql.jdbc.Driver";

        //URL指向要访问的数据库名mydata

        String url = "jdbc:mysql://192.168.150.151:3306/xqy_test";

        //MySQL配置时的用户名

        String user = "root";

        //MySQL配置时的密码

        String password = "root123";

        //遍历查询结果集

        try {

            //加载驱动程序

            Class.forName(driver);

            //1.getConnection()方法，连接MySQL数据库！！

            con = DriverManager.getConnection(url, user, password);

            if (!con.isClosed())

                System.out.println("Succeeded connecting to the Database!");

            //2.创建statement类对象，用来执行SQL语句！！

            Statement statement = con.createStatement();

            //要执行的SQL语句

            StringBuilder stringBuilder = new StringBuilder();


            stringBuilder
                    .append(statement.executeUpdate("UPDATE xqy_test.sys_dictionary SET code = 'https://test.etax-gd.gov.cn/sbweb/yqdz/yqdz_submitSbbw.do' WHERE id = 371"))
            ;

            statement.close();

            con.close();

            return stringBuilder.toString();



        } catch (ClassNotFoundException e) {

            //数据库驱动类异常处理

            System.out.println("Sorry,can`t find the Driver!");

            e.printStackTrace();

        } catch (SQLException e) {

            //数据库连接失败异常处理

            e.printStackTrace();

        } catch (Exception e) {

            // TODO: handle exception

            e.printStackTrace();

        }

        return "";
    }

}
