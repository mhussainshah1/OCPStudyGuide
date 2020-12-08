package ocp11.ch21.review;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Ten {

    public static void main(String[] args) throws SQLException {
        var sql = "SELECT toy FROM enrichment WHERE animal = ?";
        try (var conn = DriverManager.getConnection("jdbc:derby:exam");
                var ps = conn.prepareStatement(sql)) {
            ps.setString(1, "bat");
            try (var rs = ps.executeQuery(sql)) {
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            }
        }
    }
}
