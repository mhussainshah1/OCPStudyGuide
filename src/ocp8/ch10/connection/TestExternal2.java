package ocp8.ch10.connection;

import java.sql.*;

//java -cp "C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-java-8.0.15.jar" TestExternal2.java
public class TestExternal2 {

    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Outfit",
                "root",
                "password");
        System.out.println(conn);
    }
}