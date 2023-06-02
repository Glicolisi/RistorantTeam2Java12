package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton, fornisce una istanza costante al codice
//tre pezzi
//come lavora spring
public class ConnectionProvider {

    private static Connection connection; //1 pezzo con variabile statica
    private static final String URL = "jdbc:mysql://localhost:3306/ristoranteteam2java12";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "M@ss1m1l1@no";

    private ConnectionProvider() { //2 pezzo con costruttore privato

    }

    public static Connection getInstance() throws SQLException { //metodo statico per poterlo instanziare

        if (connection==null||connection.isClosed()){

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }

        return connection;

    }
}
