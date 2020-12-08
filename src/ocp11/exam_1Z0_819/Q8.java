package ocp11.exam_1Z0_819;

/**
 *
 * create database exam; 
 * use exam; 
 * create table EMP (ID INT, Name_of_employee VARCHAR(20), DEPT VARCHAR(20)); 
 * INSERT into EMP VALUES(101,'SMITH','HR'); 
 * INSERT into EMP VALUES(102,'JONES','ENG');
 * INSERT into EMP VALUES(103,'WEAVER','HR'); 
 * select * from EMP;
 *
 */
import java.sql.*;

public class Q8 {

    public static void main(String[] args) throws SQLException {
        try (var conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password");
                var query = conn.prepareStatement("SELECT ID, NAME FROM EMP WHERE DEPT = ?");
                var update = conn.prepareStatement("INSERT INTO RECRUITING (ID , NAME) VALUES(?, ?)")) {
            
            System.out.println(query);
            query.setString(1, "HR");
            var rs = query.executeQuery();
            while (rs.next()) {
                update.setObject(1, rs.getObject(1, Integer.class), JDBCType.INTEGER);
                update.setObject(2, rs.getObject(2, String.class), JDBCType.VARCHAR);
                update.execute();
                System.out.println("run");
            }
        }
    }
}
