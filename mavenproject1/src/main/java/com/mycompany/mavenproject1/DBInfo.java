package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBInfo {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "Xdgxcx@200#3";
    private static String CONNECTION_URL = "jdbc:mysql://localhost:3306/";

    public static Connection conDB(MultiDB db_name) throws SQLException {
        Connection con = null;
        CONNECTION_URL += db_name;
        con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
        return con;
    }
}
