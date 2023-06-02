package DAO;

import enumartion.TypesPortataEnum;
import portate.Portata;
import portate.SecondiPiatti;

import java.sql.*;


public class DaoSecondiPiatti {

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
                            "hasFrozenProduct TINYINT(1)," +
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

    public void insertSecondoPiatto(SecondiPiatti secondiPiatti) {
        Connection conn = null;
        int hasFrozenProductToInt = secondiPiatti.isHasFrozenProduct() ? 1:0;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO secondiPiatti" +
                    " (nome, prezzo, ingredienti,tipoPortata,hasFrozenProduct) VALUES ('" +
                    secondiPiatti.getNome() + "', '" + secondiPiatti.getPrezzo() + "', '" + secondiPiatti.getIngredienti() + "', '" +
                    secondiPiatti.getTipoPortata() + "', '" + hasFrozenProductToInt + "');";

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
            rs = stmt.executeQuery("SELECT * FROM secondiPiatti");
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

    public void updateTable(SecondiPiatti secondiPiatti, int ID) {

        Connection conn = null;
        int hasFrozenProductToInt = secondiPiatti.isHasFrozenProduct() ? 1:0;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();

           String updateQuery= "UPDATE secondipiatti"+
            " SET nome='"+secondiPiatti.getNome()+"',"+
            " prezzo= "+secondiPiatti.getPrezzo()+", ingredienti='"+secondiPiatti.getIngredienti()+
            "', tipoPortata='"+ secondiPiatti.getTipoPortata()+"', hasFrozenProduct= "+hasFrozenProductToInt+
            " WHERE ID="+ID+";";

            statement.executeUpdate(updateQuery);
            statement.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            System.out.println("Tabella aggiornata");
    }

    public void deleteTableRow(int ID) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String deleteQuery = "";

            if (ID == 0) {

                deleteQuery = "DELETE FROM secondiPiatti ;";
            } else {

                deleteQuery = "DELETE FROM secondiPiatti" +
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

