package ocp8.ch10.review;

import java.sql.*;

public class Nine {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        String sql = "SELECT * from animal";
        
        boolean bool = stmt.execute(sql);
        int num = stmt.executeUpdate(sql);
        ResultSet rs = stmt.executeQuery(sql);
    }
}