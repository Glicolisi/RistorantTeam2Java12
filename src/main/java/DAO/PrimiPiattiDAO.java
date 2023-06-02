package DAO;

import enumartion.StagioniEnum;
import enumartion.TypesPortataEnum;
import portate.PrimiPiatti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrimiPiattiDAO {

    // Metodo per inserire un nuovo primo piatto nel database
    public void insertPrimiPiatti(PrimiPiatti primiPiatti) throws SQLException {
        String query = "INSERT INTO PRIMI_PIATTI (nome, prezzo, ingredienti, tipo_portata, stagione) " +
                "VALUES (?, ?, ?, ?, ?)";

        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);//devo prenderla dalla Singleton
        statement.setString(1, primiPiatti.getNome());
        statement.setDouble(2, primiPiatti.getPrezzo());
        statement.setString(3, primiPiatti.getIngredienti());
        statement.setString(4, primiPiatti.getTipoPortata().getTipo()); // con .name() si risparmia tutto il casino dei trim
        statement.setString(5, primiPiatti.getStagione().getStagione());

        statement.executeUpdate();
        statement.close();
    }

    // Metodo per recuperare tutti i primi piatti dal database
    public List<PrimiPiatti> getAllPrimiPiatti() throws SQLException {
        List<PrimiPiatti> primiPiattiList = new ArrayList<>();
        String query = "SELECT * FROM PRIMI_PIATTI";

        Statement statement = ConnectionProvider.getInstance().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            Double prezzo = resultSet.getDouble("prezzo");
            String ingredienti = resultSet.getString("ingredienti");
            TypesPortataEnum tipoPortata = TypesPortataEnum.valueOf((resultSet.getString("tipo_portata")).toUpperCase().trim().replace(" ", ""));
            StagioniEnum stagione = StagioniEnum.valueOf((resultSet.getString("stagione")).toUpperCase().trim().replace(" ", ""));

            PrimiPiatti primiPiatti = new PrimiPiatti(nome, prezzo, ingredienti, tipoPortata, stagione);
            primiPiattiList.add(primiPiatti);
        }

        resultSet.close();
        statement.close();

        return primiPiattiList;
    }

    //Metodo per aggiornare piatti già esistenti tramite nome del piatto

    public void updatePrimiPiatti(PrimiPiatti primiPiatti) throws SQLException {
        String query = "UPDATE PRIMI_PIATTI SET prezzo = ?, ingredienti = ?, stagione = ? WHERE nome = ?";

        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setDouble(1, primiPiatti.getPrezzo());
        statement.setString(2, primiPiatti.getIngredienti());
        statement.setString(3, primiPiatti.getStagione().getStagione());
        statement.setString(4, primiPiatti.getNome());


        statement.executeUpdate();
        statement.close();
    }


    // Metodo per eliminare un primo piatto dal database
    public void deletePrimiPiatti(String nome) throws SQLException {
        String query = "DELETE FROM PRIMI_PIATTI WHERE nome = ?";

        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, nome);

        statement.executeUpdate();
        statement.close();
    }


}
