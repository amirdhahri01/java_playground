package com.mycompany.mavenproject1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

public class ReadData {

    public static void readData(ResultSet resSet) throws SQLException {
        while (resSet.next()) {
            StringBuilder stringBuilder = new StringBuilder();
            int salary = resSet.getInt("id");
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
            String res = numberFormat.format(salary);
            stringBuilder.append("Name : ");
            stringBuilder.append(resSet.getString("name"));
            stringBuilder.append("\n");
            stringBuilder.append("Salary : ");
            stringBuilder.append(res);
            stringBuilder.append("\n");
            stringBuilder.append("Address : ");
            stringBuilder.append(resSet.getString("address"));
            stringBuilder.append("\n");
            stringBuilder.append("Email : ");
            stringBuilder.append(resSet.getString("email"));
            stringBuilder.append("\n");
            stringBuilder.append("Phone Number: ");
            stringBuilder.append(resSet.getString("tel"));
            stringBuilder.append("\n");
            System.out.println(stringBuilder);
        }
    }
}
