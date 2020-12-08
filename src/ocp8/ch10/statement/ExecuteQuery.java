package ocp8.ch10.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
    public static void main(String[] args) throws SQLException {
          Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("select * from species");
    }
}