package ocp8.ch10.resultSet;

import java.sql.*;
public class Absolute {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("select id from animal order by id");
        System.out.println(rs.absolute(2)); // true
        System.out.println(rs.getString("id")); // 2
        System.out.println(rs.absolute(0)); // false
        System.out.println(rs.absolute(5)); // true
        System.out.println(rs.getString("id")); // 5
        System.out.println(rs.absolute(-2)); // true
        System.out.println(rs.getString("id")); // 4
    }
}
