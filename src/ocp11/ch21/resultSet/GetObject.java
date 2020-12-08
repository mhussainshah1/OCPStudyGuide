package ocp11.ch21.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetObject {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        var sql = "SELECT id, name FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {

            while (rs.next()) {
                Object idField = rs.getObject("id");
                Object nameField = rs.getObject("name");
                if (idField instanceof Integer) {
                    int id = (Integer) idField;
                    System.out.println(id);
                }
                if (nameField instanceof String) {
                    String name = (String) nameField;
                    System.out.println(name);
                }
            }
        }
    }
}