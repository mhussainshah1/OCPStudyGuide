package ocp11.ch21.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class Batching {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        register(conn, 100, 1, "Elias", "Ester");
    }

    public static void register(Connection conn, int firstKey,
            int type, String... names) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        var nextIndex = firstKey;
        
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(2, type);
            
            for (var name : names) {
                ps.setInt(1, nextIndex);
                ps.setString(3, name);
                ps.addBatch();
                nextIndex++;
            }
            
            int[] result = ps.executeBatch();
            System.out.println(Arrays.toString(result));
        }
    }
}