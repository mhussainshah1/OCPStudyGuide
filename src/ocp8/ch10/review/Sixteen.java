package ocp8.ch10.review;

import java.sql.*;

public class Sixteen {

    public static void main(String[] args) throws SQLException {
        String sql = "select name from animal";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            rs.next();
            rs.previous();
            rs.previous();
            rs.next();
            rs.next();
            rs.absolute(2);
            System.out.println(rs.getString(1));
        }
    }
}