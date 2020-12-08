package ocp11.ch16.exception;

import java.sql.SQLException;

public class ThrowVsThrows {

    public String getDataFromDatabase() throws SQLException {
        throw new UnsupportedOperationException();
    }

}
