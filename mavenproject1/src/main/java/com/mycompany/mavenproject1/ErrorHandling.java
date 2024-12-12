package com.mycompany.mavenproject1;

import java.sql.SQLException;


public class ErrorHandling {
    
    public static void errException(SQLException e){
        System.err.println("Code : " + e.getErrorCode());
        System.err.println("Message : " + e.getMessage());
        System.err.println("Localized Message : " + e.getLocalizedMessage());
        System.err.println("SQL State : " + e.getSQLState());
    }
}
