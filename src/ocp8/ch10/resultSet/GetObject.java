package ocp8.ch10.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetObject {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select id, name from species");
        while (rs.next()) {
            Object idField = rs.getObject("id");
            Object nameField = rs.getObject("name");
            if (idField instanceof Integer) {
                int id = (Integer) idField;
                System.out.println(id);
            }
            if (nameField instanceof String) {
                String name = (String) nameField;
                System.out.println(name);
            }
        }
    }
}