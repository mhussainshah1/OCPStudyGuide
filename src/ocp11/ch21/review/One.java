package ocp11.ch21.review;

import java.sql.*;

/**
 * 
 * Given the data of the EMP table:
 *
 * ID  NAME  DEPT 
 * 101 SMITH  HR 
 * 102 JONES  ENG 
 * 103 WEAVER HR 
 * 
 * Assuming that ds refers to a DataSource:
 *
 * Which two happen upon execution?
 * 
 * A) Three PreparedStatement objects are created. 
 * B) Two PreparedStatement objects are created. 
 * C) Two SQL statements are executed. 
 * D) Three SQL statements are executed. 
 * E) A SQLException is thrown because the ResultSet is not closed. 
 * F) Memory leaks because the Connection, PreparedStatements, and ResultSet are not closed.
 * 
 */
public class One {

    public static void main(String[] args) throws SQLException {
 
        try (var conn = DriverManager.getConnection("jdbc:derby:exam");
                var query = conn.prepareStatement("SELECT ID, NAME FROM EMP WHERE DEPT = ?");
                var update = conn.prepareStatement("INSERT INTO RECRUITING (NAME, ID) VALUES(?, ?)")) {
            query.setString(1, "HR");
            var rs = query.executeQuery();
            while (rs.next()) {
                update.setObject(1, rs.getObject(1, Integer.class), JDBCType.INTEGER);
                update.setObject(2, rs.getObject(2, String.class), JDBCType.VARCHAR);
                
                boolean isResultSet = update.execute();
                if(isResultSet){
                    try(var rs2 = update.getResultSet()){
                        System.out.println("ran a query");
                    }
                } else{
                    System.out.println("ran an update " +update.getUpdateCount());
                }
            }
        }
    }
}
