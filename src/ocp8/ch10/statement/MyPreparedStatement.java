package ocp8.ch10.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" MyPreparedStatement.java
public class MyPreparedStatement {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
//        scaryDelete(conn, "any' or 1 = 1 or name='any");
        safeDelete(conn, "any' or 1 = 1 or name='any");
    }

    private static void scaryDelete(Connection conn, String name) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "delete from animal where name = '" + name + "'";
        System.out.println(sql);
        stmt.executeUpdate(sql);
    }

    private static void safeDelete(Connection conn, String name) throws SQLException {
        Statement stmt = conn.createStatement();
        PreparedStatement ps = conn.prepareStatement("delete from animal where name = ?");
        ps.setString(1, name);
        System.out.println(ps.execute());
    }
}
