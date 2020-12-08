package ocp8.ch10.review;

import java.sql.*;

public class Seven {

    public static void main(String[] args) throws SQLException {
        Seven s = new Seven();
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        s.stmt(conn,ResultSet.CONCUR_READ_ONLY);//By Default
        s.stmt(conn,ResultSet.CONCUR_UPDATABLE);
    }

    public void stmt(Connection conn, int b) throws SQLException {
        Statement stmt;
        stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, b); //By Default
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, b);
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, b);
    }
}