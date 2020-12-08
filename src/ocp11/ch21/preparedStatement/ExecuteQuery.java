package ocp11.ch21.preparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteQuery {

    public static void main(String[] args) throws SQLException {
        var sql = "SELECT * FROM exhibits";
        try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
                var ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            // work with rs
            while (rs.next()) {
                System.out.println(rs.getString(1)
                        + ", " + rs.getString(2)
                        + ", " + rs.getString(3));
            }
        }
    }
}
