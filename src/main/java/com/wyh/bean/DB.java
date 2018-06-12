package com.wyh.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static Connection connection;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://127.0.0.1:3306/vip";
    private static String username = "root";
    private static String password = "123456";

    static {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
