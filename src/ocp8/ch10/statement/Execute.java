package ocp8.ch10.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        String sql = "select * from species";
        
        boolean isResultSet = stmt.execute(sql);
        if (isResultSet) {
            ResultSet rs = stmt.getResultSet();
            System.out.println("ran a query");
        } else {
            int result = stmt.getUpdateCount();
            System.out.println("ran an update");
        }
    }
}
