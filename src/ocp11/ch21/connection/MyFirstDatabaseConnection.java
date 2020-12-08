package ocp11.ch21.connection;

import java.sql.*;

public class MyFirstDatabaseConnection {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement ps = conn.prepareStatement("select * from names");
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString(1)
                        + ", " + rs.getString(2)
                        + ", " + rs.getString(3));
            }
        }
    }
}