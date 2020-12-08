package ocp8.ch10.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" ExecuteUpdate.java

public class ExecuteUpdate {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate( "insert into species values(10, 'Deer', 3)");
        System.out.println(result); // 1
        result = stmt.executeUpdate("update species set name = '' where name = 'None'");
        System.out.println(result); // 0
        result = stmt.executeUpdate("delete from species where id = 10");
        System.out.println(result); // 1       
    }
}