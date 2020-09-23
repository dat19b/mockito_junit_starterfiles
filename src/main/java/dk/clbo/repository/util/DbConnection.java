package dk.clbo.repository.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private final static String USERNAME = "root";
    private final static String PASSWORD = "1234";
    private final static String CONNSTRING = "jdbc:mysql://localhost:3306/studentsadmin";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(CONNSTRING, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
