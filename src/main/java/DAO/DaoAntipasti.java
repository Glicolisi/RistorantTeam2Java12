package DAO;

import portate.Antipasti;
import portate.Portata;

import java.sql.*;

public class DaoAntipasti {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/ristorante"; // jdbc:mysql://localhost:3306/ristorante  jdbc:mysql://localhost:3306/rubricab
    private static final String USER = "root"; // root
    private static final String PASS = "password"; // password

    public void createTable(String nomeTabella) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement statement = conn.createStatement();

            String createQuery =
                    "CREATE TABLE IF NOT EXISTS " + nomeTabella +
                            " ( ID INTEGER(10) NOT NULL AUTO_INCREMENT," +
                            "name VARCHAR(255)," +
                            "prezzo DOUBLE," +
                            "ingredienti VARCHAR(255)," +
                            "tipoPortata VARCHAR(255),"+
                            "chilometroZero BOOLEAN" +
                            " PRIMARY KEY (ID)" +
                            " );";


            statement.executeUpdate(createQuery);

            statement.close();

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tabella creata");
    }

    public void insertAntipasti(Antipasti antipasti, String nomeTabella) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO " + nomeTabella +
                    " (name, prezzo, ingredienti,tipoPortata, chilometroZero) VALUES ('" +
                    antipasti.getNome() + "', '" +
                    antipasti.getPrezzo() + "', '" +
                    antipasti.getIngredienti() + "', '" +
                    antipasti.getTipoPortata() + "', '" +
                    antipasti.isKmZero() + "');";

            statement.executeUpdate(insertQuery);


            statement.close();

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tabella " + nomeTabella + " aggiornata");

    }

    // copiato da secondiPiatti. chiedere info
    public void printTable(String nomeTabella) {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM " + nomeTabella + ";");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Stampa i nomi delle colonne
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Stampa i dati delle righe
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTable(String colonna, int ID, String nuovoValore, String nomeTabella) {

        Connection conn = null;
        String updateQuery="";

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

            switch (colonna){
                case "prezzo"->{ double myDouble = Double.parseDouble(nuovoValore);

                    updateQuery = "UPDATE " + nomeTabella +
                            " SET " + colonna + " =" + myDouble +
                            " WHERE ID = " + ID + " ;"; }

                case "hasFrozenProduct"->{
                    int myInt= Integer.parseInt(nuovoValore);

                    updateQuery="UPDATE " + nomeTabella +
                            " SET " + colonna + " =" + myInt +
                            " WHERE ID = " + ID + " ;";}

                default -> {updateQuery = "UPDATE " + nomeTabella +
                        " SET " + colonna + " = " +"'"+ nuovoValore+"'" +
                        " WHERE ID = " + ID + " ;";}
            }

            statement.executeUpdate(updateQuery);
            statement.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tabella " + nomeTabella + " aggiornata");
    }

    public void deleteTableRow(int ID, String nomeTabella) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String deleteQuery = "";

            if (ID == 0) {

                deleteQuery = "DELETE FROM " + nomeTabella + " ;";
            } else {

                deleteQuery = "DELETE FROM " + nomeTabella +
                        " WHERE ID = " + ID + " ;";
            }

            statement.executeUpdate(deleteQuery);
            statement.close();
            conn.close();

            System.out.println("Delete eseguito con successo");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
