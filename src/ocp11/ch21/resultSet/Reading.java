package ocp11.ch21.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" Reading.java
public class Reading {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");

        //Read Data
        String sql = "SELECT id, name FROM exhibits";
        Map<Integer, String> idToNameMap = new HashMap<>();

        try (var ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
        }

        //Alternatively,
        idToNameMap = new HashMap<>();

        try (var ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap);
        }

        //One row
        sql = "SELECT count(*) FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt(1);//2
                System.out.println(count);
            }
        }

        sql = "SELECT count(*) AS count FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
                var rs = ps.executeQuery()) {
            if (rs.next()) {
                var count = rs.getInt("count");//2
                System.out.println(count);
            }
        }
    }
}
