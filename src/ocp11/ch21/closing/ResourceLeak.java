package ocp11.ch21.closing;

import java.sql.*;

public class ResourceLeak {

    public static void main(String[] args) throws SQLException {
       
    }

    public void bad() throws SQLException {
        var url = "jdbc:derby:zoo";
        var sql = "SELECT not_a_column FROM names";
        var conn = DriverManager.getConnection(url);
        var ps = conn.prepareStatement(sql);
        var rs = ps.executeQuery();

        try (conn; ps; rs) {
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        }
    }
}
