package ocp8.ch10.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" BadCode.java
public class BadCode {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select * from animal where name= 'Not in table'");
        rs.next(); //false
        rs.getInt(1); // throws SQLException
       
        rs = stmt.executeQuery("select count(*) from animal");
        rs.next();
        rs.getInt(0); // throws SQLException :Column '0' not found.
            
        rs = stmt.executeQuery("select id from animal");
        rs.next();
        rs.getInt("badColumn"); // throws SQLException
        
        //Not calling rs.next()
        rs = stmt.executeQuery("select count(*) from animal");
        rs.getInt(1); // throws SQLException
    }
}
