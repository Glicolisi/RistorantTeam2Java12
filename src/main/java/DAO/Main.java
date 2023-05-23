package DAO;

import enumartion.TypesPortataEnum;
import portate.Antipasti;
import portate.Portata;
import portate.Bevande;
import portate.SecondiPiatti;

public class Main {
    public static void main(String[] args) {

        DaoAntipasti daoAntipasti = new DaoAntipasti();
        String nomeTabella = "Antipasti";

        daoAntipasti.createTable(nomeTabella);

        Antipasti antipasto1 = new Antipasti("Caprese", 5.00, "Mozzarella fior di latte, Pomodoro", TypesPortataEnum.ANTIPASTO, true);
        Antipasti antipasto2 = new Antipasti("Tagliere di salumi e formaggi", 10.00, "Prosciutto cotto, Prosciutto crudo, Provola affumicata, Caprino", TypesPortataEnum.ANTIPASTO, false);
        Antipasti antipasto3 = new Antipasti("Frittura di verdure miste", 6.00, "Pastella, Cavolfiori, Zucchine, Melanzane, Carciofi", TypesPortataEnum.ANTIPASTO, true);
        Antipasti antipasto4 = new Antipasti("Anelli di cipolla", 5.00, "Pastella, Cipolla", TypesPortataEnum.ANTIPASTO, false);
        Antipasti antipasto5 = new Antipasti("Antipasto della casa", 7.00, "Olive, Ricotta, Salame, Funghi sott'olio", TypesPortataEnum.ANTIPASTO, true);

        daoAntipasti.insertAntipasti(antipasto1, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto2, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto3, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto4, nomeTabella);
        daoAntipasti.insertAntipasti(antipasto5, nomeTabella);

        daoAntipasti.updateTable("prezzo",1,"5.99", nomeTabella);

        daoAntipasti.printTable(nomeTabella);

        DaoSecondiPiatti daoSecondiPiatti = new DaoSecondiPiatti();


        daoSecondiPiatti.createTable();

        SecondiPiatti secondo1 = new SecondiPiatti("Carpaccio di filetto con rucola e scaglie di parmigiano", 12.00, "carne,verdura,formaggio", TypesPortataEnum.SECONDOPIATTO, false);
        SecondiPiatti secondo2 = new SecondiPiatti("Grigliata di scampi e gamberi", 16.0, "crostacei,pesce", TypesPortataEnum.SECONDOPIATTO, false);
        SecondiPiatti secondo3 = new SecondiPiatti("Impepata di cozze", 12.0, "molluschi", TypesPortataEnum.SECONDOPIATTO, false);
        SecondiPiatti secondo4 = new SecondiPiatti("Filetto di manzo alla tartara", 13.0, "carne", TypesPortataEnum.SECONDOPIATTO, false);
        SecondiPiatti secondo5 = new SecondiPiatti("Nodino di vitello alla griglia", 13.0, "carne", TypesPortataEnum.SECONDOPIATTO, false);

        daoSecondiPiatti.insertSecondoPiatto(secondo1);
        daoSecondiPiatti.insertSecondoPiatto(secondo2);
        daoSecondiPiatti.insertSecondoPiatto(secondo3);
        daoSecondiPiatti.insertSecondoPiatto(secondo4);
        daoSecondiPiatti.insertSecondoPiatto(secondo5);

        daoSecondiPiatti.updateTable("prezzo",1,"9.99");
        daoSecondiPiatti.updateTable("hasFrozenProduct",2,"1");
        daoSecondiPiatti.updateTable("nome",3,"TEST_UPDATE_NOME");



        daoSecondiPiatti.printTable();

        DaoBevande daoBevande=new DaoBevande();

        daoBevande.createTable();

        Bevande bevanda1 = new Bevande("Acqua naturale", 1d, "Acqua", TypesPortataEnum.BEVANDA, false);
        Bevande bevanda2 = new Bevande("Acqua frizzante", 1d, "Acqua, bollicine", TypesPortataEnum.BEVANDA, false);
        Bevande bevanda3 = new Bevande("Sprite", 3d, "Acqua, zucchero, anidride carbonica, acido citrico edulcoranti acesulfame K, aspartame e neoesperidina DC, correttore di acidità citrato trisodico,lime", TypesPortataEnum.BEVANDA, false);
        Bevande bevanda4 = new Bevande("Coca cola", 3d, "Acqua, anidride carbonica, zucchero, colorante caramello,aromi naturali, caffeina e acido fosforico", TypesPortataEnum.BEVANDA, false);
        Bevande bevanda5 = new Bevande("Vino", 100d, "Glicerolo,Acido tartarico,Acido malico,Acido lattico,Acido acetico,Zuccheri", TypesPortataEnum.BEVANDA, true);

        daoBevande.insertBevanda(bevanda1);
        daoBevande.insertBevanda(bevanda2);
        daoBevande.insertBevanda(bevanda3);
        daoBevande.insertBevanda(bevanda4);
        daoBevande.insertBevanda(bevanda5);

        daoBevande.printTable();

    }
}