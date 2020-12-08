package ocp11.ch21.review;

import java.sql.*;

public class Eleven {

    public static void main(String[] args) {
        var sql = "UPDATE food SET amount = amount + 1";
        try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
                var ps = conn.prepareStatement(sql)) {
            var result = ps.executeUpdate();
            System.out.println(result);
        }
    }
}
