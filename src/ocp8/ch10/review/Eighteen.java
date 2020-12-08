package ocp8.ch10.review;

import java.sql.*;

public class Eighteen {

    public static void main(String[] args) throws SQLException {
        String sql = "select name from animal order by id";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            
            rs.absolute(0);
            rs.next();
            System.out.println(rs.getString(1));
        }
    }
}
