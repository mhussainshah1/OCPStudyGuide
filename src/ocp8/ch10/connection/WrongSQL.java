package ocp8.ch10.connection;

import java.sql.*;

public class WrongSQL {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("select * from names");
    }
}