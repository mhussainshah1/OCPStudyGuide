package ocp11.ch21.resultSet;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BindVariables {

    public static void main(String[] args) throws SQLException {
        var conn = DriverManager.getConnection("jdbc:derby:zoo");
        var sql = "SELECT id FROM exhibits WHERE name = ?";

        try (var ps = conn.prepareStatement(sql)) {
            ps.setString(1, "Zebra");
            try (var rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    System.out.println(id);
                }
            }
        }
    }
}