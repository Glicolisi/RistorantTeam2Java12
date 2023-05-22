package DAO;

import enumartion.TypesPortataEnum;
import portate.SecondiPiatti;

public class Main {
    public static void main(String[] args) {

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

    }
}
