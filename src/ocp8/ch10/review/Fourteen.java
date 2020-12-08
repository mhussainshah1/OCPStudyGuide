package ocp8.ch10.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fourteen {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select count(*) from species");
        if (rs.next()) {
            String s = rs.getString(1);
            Object s1 = rs.getObject(1);
        }
    }
}
