package ocp8.ch10.review;

import java.sql.*;

public class Thirteen {

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
                Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("select count(*) from species");
            int num = stmt.executeUpdate("INSERT INTO species VALUES (3, 'Ant', .05)");
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}