package ocp11.ch21.review;

import java.sql.*;

public class Eight {

    public static void main(String[] args) throws SQLException {
        var sql = "UPDATE names SET name = 'Animal'";
        try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
                var ps = conn.prepareStatement(sql)) {
            var result = ps.executeUpdate();
            System.out.println(result);
        }
    }
}