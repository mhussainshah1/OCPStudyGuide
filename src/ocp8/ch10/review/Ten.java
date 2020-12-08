package ocp8.ch10.review;

import java.sql.*;

public class Ten {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("update animal set name = name");
        System.out.println(result);
    }
}