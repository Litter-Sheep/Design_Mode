package com.xiaobai.connectionSql;

import java.sql.*;

/**
 * @paogram: com.xiaobai.connectionSql
 * @description: the MySql demo
 * @author: CodeXiaoBai
 * @createDate: 2022-08-03
 */

public class MySqlDemo {
    // mysql 驱动和数据库URL
    final static String JDBC_DRIVER = "com.mysql.jc.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";

    // 数据库用户名和数据库密码
    final static String USER = "root";
    final static String PASSWORD = "Mysql@xl2103";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // 注册JDBC驱动
            Class.forName(JDBC_DRIVER);

            // 打开连接
            System.out.println("连接数据库...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // 执行查询
            System.out.println("实例化Statement对象");
            statement = connection.createStatement();
            String sql = "SELECT id, name, url FROM websites";
            ResultSet resultSet = statement.executeQuery(sql);

            // 展开结果集数据库
            while (resultSet.next()) {
                // 通过字段查询
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String url = resultSet.getString("url");

                // 打印结果
                System.out.print("id: " + id);
                System.out.print(", name: " + name);
                System.out.print(", url: " + url);
                System.out.println();

                // 完成后关闭
                resultSet.close();
                statement.close();
                connection.close();
            }

        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("GoodBye!");
    }
}
