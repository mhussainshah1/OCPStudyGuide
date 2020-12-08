package ocp11.ch21.preparedStatement;

import java.sql.*;

public class WrongSQL {

    public static void main(String[] args) throws SQLException {
        var sql = "SELECT * FROM names";
//        try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
//                var ps = conn.prepareStatement(sql)) {
//            var result = ps.executeUpdate(); //SQLException: Statement.executeUpdate() cannot be called with a statement that returns a ResultSet.
//        }

        sql = """
              UPDATE exhibits 
              SET name = '' 
              WHERE name = 'None'
              """;
        try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
                var ps = conn.prepareStatement(sql)) {
            var result = ps.executeQuery(); //: Statement.executeQuery() cannot be called with a statement that returns a row count.
        }

    }
}
