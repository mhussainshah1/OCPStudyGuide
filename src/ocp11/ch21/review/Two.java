package ocp11.ch21.review;

import java.sql.*;

/**
 *
 * Assume ds is a DataSource and the EMP table is defined appropriately.
 *
 * What does executing this code fragment do?
 *
 * A) inserts two rows (101, 'SMITH', 'HR') and (102, 'JONES', 'HR')  (Answer)
 * B) inserts one row (101, 'SMITH', 'HR') 
 * C) inserts two rows (101, 'SMITH', 'HR') and (102, 'JONES', NULL) 
 * D) throws a SQLException
 * 
 */
public class Two {

    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection("jdbc:derby:exam");
                PreparedStatement ps = conn.prepareStatement("INSERT INTO EMP VALUES(?, ?, ?)")) {
            ps.setObject(1, 101, JDBCType.INTEGER);
            ps.setObject(2, "SMITH", JDBCType.VARCHAR);
            ps.setObject(3, "HR", JDBCType.VARCHAR);
            System.out.println(ps.executeUpdate());//1
            
            ps.setInt(1, 102);
            ps.setString(2, "JONES");
            System.out.println(ps.executeUpdate());//1
        }
    }
}
