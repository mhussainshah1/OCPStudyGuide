package ocp11.ch21.review;

import java.sql.*;

public class Eighteen {

    public static void main(String[] args) throws SQLException {
        try (var conn = DriverManager.getConnection("jdbc:derby:zoo");){
            register(conn);
        }     
    }

    public static void register(Connection conn) throws SQLException {
        String insert = "INSERT INTO exhibits VALUES (3, 'Ant', .05)";
        String select = "SELECT count(*) FROM exhibits";

        try (var ps = conn.prepareStatement(insert)) {
            ps.executeUpdate();
        }
        try (var ps = conn.prepareStatement(select)) {
            var rs = ps.executeQuery();
            System.out.println(rs.getInt(1));//SQLException: Invalid cursor state - no current row.
        }
    }
}
