package ocp11.ch21.connection;

import java.sql.*;

//java -cp "C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-java-8.0.15.jar" TestExternal.java
public class TestExternal {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Outfit",
                "root",
                "password");
        System.out.println(conn);//com.mysql.cj.jdbc.ConnectionImpl@4f83df68
    }
}