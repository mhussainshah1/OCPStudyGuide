package ocp8.ch10.resultSet;

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
        Statement stmt = conn.createStatement();

        //Read Data
        Map<Integer, String> idToNameMap = new HashMap<>();
        ResultSet rs = stmt.executeQuery("select id, name from species");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            idToNameMap.put(id, name);
        }
        System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}

        //One row
        rs = stmt.executeQuery("select count(*) from animal");
        if (rs.next()) {
            System.out.println(rs.getInt(1));//5
        }

        rs = stmt.executeQuery("select count(*) as count from animal");
        if (rs.next()) {
            System.out.println(rs.getInt("count"));//5
        }      
    }
}
