package fr.snooker4real.facturation.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnexionBdd {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Properties properties = new Properties();
        try {
            properties.load(ConnexionBdd.class.getResourceAsStream("/application.properties"));
        } catch (IOException e){
            e.printStackTrace();
        }
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        Class.forName(driver);
        System.out.println(url);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
