package DAO;

import portate.Antipasti;
import portate.Portata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoAntipasti {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/ristorante"; // jdbc:mysql://localhost:3306/ristorante  jdbc:mysql://localhost:3306/rubricab
    private static final String USER = ""; // root
    private static final String PASS = ""; // password

    public void createTable(String nomeTabella) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement statement = conn.createStatement();

            String createQuery =
                    "CREATE TABLE IF NOT EXISTS " + nomeTabella +
                            " ( " + nomeTabella + "_id INTEGER(10) NOT NULL AUTO_INCREMENT," +
                            "name VARCHAR(255)," +
                            "prezzo DOUBLE," +
                            "ingredienti VARCHAR(255)," +
                            "tipoPortata VARCHAR(255),"+
                            "chilometroZero BOOLEAN" +
                            "CONSTRAINT " + nomeTabella + "_pk PRIMARY KEY ( " + nomeTabella + "_id)" +
                            " );";


            statement.executeUpdate(createQuery);

            statement.close();

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tabella " + nomeTabella + " creata");
    }

    public void insertPortata(Antipasti antipasti, String nomeTabella) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO " + nomeTabella + " (name, prezzo, ingredienti,tipoPortata, chilometroZero) VALUES ('" + antipasti.getNome() + "', '" + antipasti.getPrezzo() + "', '" + antipasti.getIngredienti() + "', '" + antipasti.getTipoPortata() + "', '" + antipasti.isKmZero() + "');";

            statement.executeUpdate(insertQuery);


            statement.close();

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tabella " + nomeTabella + " aggiornata");

    }
}
