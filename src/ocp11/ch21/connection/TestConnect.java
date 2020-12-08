package ocp11.ch21.connection;

import java.sql.*;

//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" TestConnect.java
public class TestConnect {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        System.out.println(conn);
        //org.apache.derby.impl.jdbc.EmbedConnection@1806431167 (XID = 210), (SESSIONID = 1), (DATABASE = zoo), (DRDAID = null) 
    }
}
