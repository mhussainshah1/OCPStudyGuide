package ocp8.ch10.review;

import java.sql.*;

public class Eleven {

    public static void main(String[] args) {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("update food set amount = amount + 1");
        System.out.println(result);
    }
}