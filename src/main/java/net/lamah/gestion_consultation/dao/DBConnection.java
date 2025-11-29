package net.lamah.gestion_consultation.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    static   {
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_CABINET","root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
