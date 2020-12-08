package ocp8.ch10.review;

import java.sql.*;

public class Twenty {

    public static void main(String[] args) throws SQLException {
        String sql = "select * from animal";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
                Statement stmt = conn.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs.beforeFirst());
            System.out.println(rs.absolute(5));
            System.out.println(rs.previous());
            System.out.println(rs.relative(-2));
            System.out.println(rs.afterLast());
        }
    }
}
