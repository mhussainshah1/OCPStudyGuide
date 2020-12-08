package ocp8.ch10.connection;

import java.sql.*;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" TestConnect.java
public class TestConnect {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        System.out.println(conn);
    }
}
