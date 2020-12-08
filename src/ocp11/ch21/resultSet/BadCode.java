package ocp11.ch21.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" BadCode.java
public class BadCode {

    public static void main(String[] args) throws SQLException {
        
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        var sql = "SELECT count(*) AS count FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {
            if (rs.next()) {
                var count = rs.getInt("total");// SQLException: Column 'total' not found.
                System.out.println(count);
            }
        }

        sql = "SELECT * FROM exhibits where name='Not in table'";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {
            rs.next();
            rs.getInt(1); // SQLException: Invalid cursor state - no current row.
        }

        //Not calling rs.next()
        sql = "SELECT count(*) FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {
            rs.getInt(1); // SQLException: Invalid cursor state - no current row.
        }

        sql = "SELECT count(*) FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {
            if (rs.next()) {
                rs.getInt(0); // SQLException: Column '0' not found.
            }
        }
        
        sql = "SELECT name FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {
            if (rs.next()) {
                rs.getInt("badColumn"); // SQLException: Column 'badColumn' not found.
            }
        }
    }
}