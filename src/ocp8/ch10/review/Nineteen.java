package ocp8.ch10.review;

import java.sql.*;

public class Nineteen {

    public static void main(String[] args) throws SQLException {
        String sql = "select * from animal";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
                Statement stmt = conn.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println(rs.absolute(0)); //false
            System.out.println(rs.absolute(5)); //true
            System.out.println(rs.previous()); //true
            System.out.println(rs.relative(-2)); //true
            System.out.println(rs.relative(-100)); //false
        }
    }
}