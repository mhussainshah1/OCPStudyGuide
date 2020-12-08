package ocp11.ch21.review;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Thirteen {

    public static void main(String[] args) throws SQLException {
        var sql = "SELECT num FROM counts WHERE num > ?";
        try (var conn = DriverManager.getConnection("jdbc:derby:exam");
                var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, 3);
            try (var rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getObject(1));
                }
            }
            ps.setInt(1, 100);
            try (var rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getObject(1));
                }
            }
        }
    }
}
