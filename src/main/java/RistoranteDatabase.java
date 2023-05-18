import portate.Portata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RistoranteDatabase {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ristorante";
    private static final String USER = "root";
    private static final String PASS = "password";

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

    public void insertPortata(Portata portata, String nomeTabella) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO " + nomeTabella + " (name, prezzo, ingredienti,tipoPortata) VALUES ('" + portata.getNome() + "', '" + portata.getPrezzo() + "', '" + portata.getIngredienti() + "', '" + portata.getTipoPortata() + "');";

            statement.executeUpdate(insertQuery);


            statement.close();

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tabella " + nomeTabella + " aggiornata");

    }
}