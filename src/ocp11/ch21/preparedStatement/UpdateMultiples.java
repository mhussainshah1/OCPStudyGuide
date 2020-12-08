package ocp11.ch21.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateMultiples {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (var ps = conn.prepareStatement(sql)) {

            ps.setInt(1, 20);
            ps.setInt(2, 1);
            ps.setString(3, "Ester");
            ps.executeUpdate();

            ps.setInt(1, 21);
            ps.setString(3, "Elias");
            ps.executeUpdate();
        }
    }
}
