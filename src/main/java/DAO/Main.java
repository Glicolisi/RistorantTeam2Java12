package DAO;

import enumartion.StagioniEnum;
import enumartion.TypesPortataEnum;
import portate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DaoAntipasti daoAntipasti = new DaoAntipasti();
        String nomeTabella = "Antipasti";

        daoAntipasti.createTable(nomeTabella);

        Antipasti antipasto1 = new Antipasti("Caprese", 5.00, "Mozzarella fior di latte, Pomodoro", TypesPortataEnum.ANTIPASTO, true);
        Antipasti antipasto2 = new Antipasti("Tagliere di salumi e formaggi", 10.00, "Prosciutto cotto, Prosciutto crudo, Provola affumicata, Caprino", TypesPortataEnum.ANTIPASTO, false);
        Antipasti antipasto3 = new Antipasti("Frittura di verdure miste", 6.00, "Pastella, Cavolfiori, Zucchine, Melanzane, Carciofi", TypesPortataEnum.ANTIPASTO, true);
        Antipasti antipasto4 = new Antipasti("Anelli di cipolla", 5.00, "Pastella, Cipolla", TypesPortataEnum.ANTIPASTO, false);
        Antipasti antipasto5 = new Antipasti("Antipasto della casa", 7.00, "Olive, Ricotta, Salame, Funghi sott olio", TypesPortataEnum.ANTIPASTO, true);

        daoAntipasti.insertAntipasti(antipasto1, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto2, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto3, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto4, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto5, nomeTabella);

        daoAntipasti.updateTable("prezzo",1,"5.99", nomeTabella);

        daoAntipasti.printTable(nomeTabella);

        DaoSecondiPiatti daoSecondiPiatti = new DaoSecondiPiatti();
//
//
//        try {
//            Connection connection = PrimiPiattiDAO.getConnection();
//            PrimiPiattiDAO primiPiattiDAO = PrimiPiattiDAO.getInstance(connection);
//
//
//            PrimiPiatti primo1 = new PrimiPiatti("Lasagne alla Bolognese", 12.0, "Pasta fresca, ragù di carne,besciamella", TypesPortataEnum.PRIMOPIATTO, StagioniEnum.ESTATE);
//            PrimiPiatti primo2 = new PrimiPiatti("Bucatini alla amatriciana", 11.0, "Pasta fresca,pomodoro,guanciale,pecorino", TypesPortataEnum.PRIMOPIATTO, StagioniEnum.INVERNO);
//            PrimiPiatti primo3 = new PrimiPiatti("Tortellini con panna", 14.0, "Pasta fresca,carne macinata,panna", TypesPortataEnum.PRIMOPIATTO, StagioniEnum.AUTUNNO);
//            PrimiPiatti primo4 = new PrimiPiatti("Pennette alla vodka", 10.0, "Pasta fresca,pomodoro,pancetta,vodka", TypesPortataEnum.PRIMOPIATTO, StagioniEnum.FUORI_MENU);
//            PrimiPiatti primo5 = new PrimiPiatti("Trofie al pesto genovese", 10.0, "Pasta fresca,basilico,pinoli,grana padano", TypesPortataEnum.PRIMOPIATTO, StagioniEnum.PRIMAVERA);
//
//            //inserimento dei un primi piatti nel database
//            primiPiattiDAO.insertPrimiPiatti(primo1);
//            primiPiattiDAO.insertPrimiPiatti(primo2);
//            primiPiattiDAO.insertPrimiPiatti(primo3);
//            primiPiattiDAO.insertPrimiPiatti(primo4);
//            primiPiattiDAO.insertPrimiPiatti(primo5);
//
//
//            //tutti i primi piatti dal database
//            List<PrimiPiatti> primiPiattiList = primiPiattiDAO.getAllPrimiPiatti();
//
//            //aggiornamento di un primo piatto esistente nel database
//            PrimiPiatti primiPiattiToUpdate = primiPiattiList.get(0);
//            primiPiattiToUpdate.setPrezzo(14.99);
//            primiPiattiToUpdate.setStagione(StagioniEnum.INVERNO);
//            primiPiattiDAO.updatePrimiPiatti(primiPiattiToUpdate);
//
//            //eliminazione di un primo piatto dal database
//            primiPiattiDAO.deletePrimiPiatti("Lasagne alla Bolognese");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
//
//
//        daoSecondiPiatti.createTable();
//
//        SecondiPiatti secondo1 = new SecondiPiatti("Carpaccio di filetto con rucola e scaglie di parmigiano", 12.00, "carne,verdura,formaggio", TypesPortataEnum.SECONDOPIATTO, false);
//        SecondiPiatti secondo2 = new SecondiPiatti("Grigliata di scampi e gamberi", 16.0, "crostacei,pesce", TypesPortataEnum.SECONDOPIATTO, false);
//        SecondiPiatti secondo3 = new SecondiPiatti("Impepata di cozze", 12.0, "molluschi", TypesPortataEnum.SECONDOPIATTO, false);
//        SecondiPiatti secondo4 = new SecondiPiatti("Filetto di manzo alla tartara", 13.0, "carne", TypesPortataEnum.SECONDOPIATTO, false);
//        SecondiPiatti secondo5 = new SecondiPiatti("Nodino di vitello alla griglia", 13.0, "carne", TypesPortataEnum.SECONDOPIATTO, false);
//
//        daoSecondiPiatti.insertSecondoPiatto(secondo1);
//        daoSecondiPiatti.insertSecondoPiatto(secondo2);
//        daoSecondiPiatti.insertSecondoPiatto(secondo3);
//        daoSecondiPiatti.insertSecondoPiatto(secondo4);
//        daoSecondiPiatti.insertSecondoPiatto(secondo5);
//
//        daoSecondiPiatti.updateTable("prezzo",1,"9.99");
//        daoSecondiPiatti.updateTable("hasFrozenProduct",2,"1");
//        daoSecondiPiatti.updateTable("nome",3,"TEST_UPDATE_NOME");
//
//
//
//        daoSecondiPiatti.printTable();
//
//        DaoBevande daoBevande=new DaoBevande();
//
//        daoBevande.createTable();
//
//        Bevande bevanda1 = new Bevande("Acqua naturale", 1d, "Acqua", TypesPortataEnum.BEVANDA, false);
//        Bevande bevanda2 = new Bevande("Acqua frizzante", 1d, "Acqua, bollicine", TypesPortataEnum.BEVANDA, false);
//        Bevande bevanda3 = new Bevande("Sprite", 3d, "Acqua, zucchero, anidride carbonica, acido citrico edulcoranti acesulfame K, aspartame e neoesperidina DC, correttore di acidità citrato trisodico,lime", TypesPortataEnum.BEVANDA, false);
//        Bevande bevanda4 = new Bevande("Coca cola", 3d, "Acqua, anidride carbonica, zucchero, colorante caramello,aromi naturali, caffeina e acido fosforico", TypesPortataEnum.BEVANDA, false);
//        Bevande bevanda5 = new Bevande("Vino", 100d, "Glicerolo,Acido tartarico,Acido malico,Acido lattico,Acido acetico,Zuccheri", TypesPortataEnum.BEVANDA, true);
//
//        daoBevande.insertBevanda(bevanda1);
//        daoBevande.insertBevanda(bevanda2);
//        daoBevande.insertBevanda(bevanda3);
//        daoBevande.insertBevanda(bevanda4);
//        daoBevande.insertBevanda(bevanda5);
//
//        daoBevande.printTable();

    }
}
