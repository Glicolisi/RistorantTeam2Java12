package DAO;

import enumartion.TypesPortataEnum;
import portate.Portata;
import portate.Bevande;

import java.sql.*;


public class DaoBevande {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/ristorante";
    private static final String USER = "root";
    private static final String PASS = "password";

    public void createTable() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement statement = conn.createStatement();

            String createQuery =
                    "CREATE TABLE IF NOT EXISTS secondiPiatti "  +
                            " ( ID INT AUTO_INCREMENT," +
                            "nome VARCHAR(255)," +
                            "prezzo DOUBLE," +
                            "ingredienti VARCHAR(255)," +
                            "tipoPortata VARCHAR(255)," +
                            "isAlcholic TINYINT(1)," +
                            "PRIMARY KEY (ID) " +
                            " );";


            statement.executeUpdate(createQuery);

            statement.close();

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tabella creata");
    }

    public void insertBevanda(Bevande bevanda) {
        Connection conn = null;
        int isAlcholic = bevanda.isAlcholic() ? 1:0;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO bevande" +
                    " (nome, prezzo, ingredienti,tipoPortata,isAlcholic) VALUES ('" +
                    bevanda.getNome() + "', '" + bevanda.getPrezzo() + "', '" + bevanda.getIngredienti() + "', '" +
                    bevanda.getTipoPortata() + "', '" + isAlcholic + "');";

            statement.executeUpdate(insertQuery);

            statement.close();

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Insert effettuato con successo");

    }

    public void printTable() {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM bevande");
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
    public void deleteTableRow(int ID) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String deleteQuery = "";

            if (ID == 0) {

                deleteQuery = "DELETE FROM bevande ;";
            } else {

                deleteQuery = "DELETE FROM bevande" +
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

