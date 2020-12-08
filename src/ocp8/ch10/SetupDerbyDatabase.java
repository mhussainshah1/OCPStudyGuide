package ocp8.ch10;

import java.sql.*;

//The following commands are use to setup database
//cd C:\Users\m_hus\Documents\NetBeansProjects\OCP11\src\ocp\ch10
//java -cp "C:\Program Files\Java\jdk-14.0.2\db\lib\derby.jar" SetupDerbyDatabase.java
public class SetupDerbyDatabase {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:derby:zoo;create=true";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {

            stmt.executeUpdate("DROP TABLE animal");
            stmt.executeUpdate("DROP TABLE species");

            stmt.executeUpdate("""
                               CREATE TABLE species (
                                id INTEGER PRIMARY KEY, 
                                name VARCHAR(255), 
                                num_acres DECIMAL(4,1))                    
                                """);

            stmt.executeUpdate("""
                    CREATE TABLE animal (
                    id INTEGER PRIMARY KEY, 
                    species_id integer REFERENCES species(id), 
                    name VARCHAR(255),
                    date_born TIMESTAMP)                    
                    """);

            stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
            stmt.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");

            stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06 02:15:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15 09:12:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002-09-09 10:36:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010-06-08 01:24:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005-11-12 03:44:00')");

            ResultSet rs = stmt.executeQuery("select count(*) from animal");
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}
