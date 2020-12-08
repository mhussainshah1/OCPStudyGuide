package ocp11.ch21.review;

import java.sql.*;

public class TwentyOne {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (var conn = DriverManager.getConnection(url);
                var ps = conn.prepareStatement();
                var rs = ps.executeQuery("SELECT * FROM swings")) {
            while (rs.next()) {
                System.out.println(rs.getInteger(1));
            }
        }
    }
}