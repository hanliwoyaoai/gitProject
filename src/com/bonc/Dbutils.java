package com.bonc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutils {
    private static String DRIVER_CLASS = "";
    private static String DB_URL = "";
    private static String DB_USER = "";
    private static String DB_PASS = "";

    private static Dbutils dbutils;
    private static Connection conn;

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (Exception e) {

        }


        return null;
    }
}
