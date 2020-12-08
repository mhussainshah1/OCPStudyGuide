package ocp11.ch21.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Parameters {

    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:derby:zoo");){
            register(conn);
            register(conn, 7, 1, "Meshoo");
            registerLess(conn, 8, 1, "Nika");
            registerMore(conn, 9, 1, "Brunoo");
        }        
    }

    public static void register(Connection conn) throws SQLException {
        var sql = "INSERT INTO names VALUES(6, 1, 'Edith')";
        try (var ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    public static void register(Connection conn, int key, int type, String name)
            throws SQLException {
        String sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
            ps.executeUpdate();
        }

//        //alternatively
//        try (PreparedStatement ps = conn.prepareStatement(sql)) {
//            ps.setObject(1, key);
//            ps.setObject(2, type);
//            ps.setObject(3, name);
//            ps.executeUpdate();
//        }
    }

    public static void registerLess(Connection conn, int key, int type, String name)
            throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            // missing the set for parameter number 3
            ps.executeUpdate();
        }
    }

    public static void registerMore(Connection conn, int key, int type, String name)
            throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            ps.setString(3, name);
            ps.executeUpdate();
        }
    }

    public static void wrongSQL(Connection conn, int key, int type, String name)
            throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setObject(1, key);
            ps.setObject(2, type);
            ps.setObject(3, name);
            ps.executeUpdate(sql); // INCORRECT
        }
    }
}
