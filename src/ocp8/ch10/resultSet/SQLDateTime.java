package ocp8.ch10.resultSet;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//java -cp "C:\Program Files\Java\jdk-12.0.2\db\lib\derby.jar" SQLDateTime.java

public class SQLDateTime {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs.next()) {
            Date sqlDate = rs.getDate(1);
            LocalDate localDate = sqlDate.toLocalDate();
            System.out.println(localDate); // 2001―05―06
        }

        rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs.next()) {
            Time sqlTime = rs.getTime(1);
            LocalTime localTime = sqlTime.toLocalTime();
            System.out.println(localTime); // 02:15
        }

        rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs.next()) {
            Timestamp sqlTimeStamp = rs.getTimestamp(1);
            LocalDateTime localDateTime = sqlTimeStamp.toLocalDateTime();
            System.out.println(localDateTime); // 2001―05―06T02:15
        }
    }
}