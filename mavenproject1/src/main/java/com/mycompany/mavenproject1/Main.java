package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter Name : ");
        String name = reader.readLine();
        System.out.print("\nPlease Enter Email : ");
        String email = reader.readLine();
        System.out.print("\nPlease Enter Address : ");
        String address = reader.readLine();
        System.out.print("\nPlease Enter Tel : ");
        String tel = reader.readLine();
        String sql = "INSERT INTO Clients (name,address,tel,email) values ('"+name+"','" + address+"','"+tel+"','"+email+"')";
        System.out.println(sql);
        Connection con = DBInfo.conDB(MultiDB.ecommerce);
        Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        statement.executeUpdate(sql);
        System.out.println("Data inserted");
    }

}
