package ocp11.ch21.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" ExecuteUpdate.java
public class ExecuteUpdate {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
        var updateSql = """
                        UPDATE exhibits 
                        SET name = '' 
                        WHERE name = 'None'
                        """;
        var deleteSql = "DELETE FROM exhibits WHERE id = 10";

        try (var ps = conn.prepareStatement(insertSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }

        try (var ps = conn.prepareStatement(updateSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 0
        }

        try (var ps = conn.prepareStatement(deleteSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }
    }
}
