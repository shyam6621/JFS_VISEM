package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3007/employee_db?useSSL=false&serverTimezone=UTC";
            String user = "root";       // change if needed
            String pass = "root";       // change if needed

            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
