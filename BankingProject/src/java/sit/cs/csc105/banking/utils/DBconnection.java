package sit.cs.csc105.banking.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBconnection {
    private static final String db_URL = "jdbc:mysql://csproject.sit.kmutt.ac.th:3306/csc105_61130500229";

    public static Connection getMySQLConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(db_URL, "61130500229", "GwqT4536");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

