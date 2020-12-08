package ocp11.ch21.preparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Execute {

    public static void main(String[] args) throws SQLException {
        var sql = "SELECT * FROM exhibits";
        try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
             var ps = conn.prepareStatement(sql)) {
            boolean isResultSet = ps.execute();
            if (isResultSet) {
                try (ResultSet rs = ps.getResultSet()) {
                    System.out.println("ran a query");
                }
            } else {
                int result = ps.getUpdateCount();
                System.out.println("ran an update");
            }
        }
    }
}
