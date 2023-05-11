package portate;

import enumartion.StagioniEnum;
import enumartion.ColorsEnum;
import enumartion.TypesPortataEnum;

public class PrimiPiatti extends Portata {


    private StagioniEnum stagione;

    /**
     *
     * @param nome
     * @param prezzo
     * @param ingredienti
     * @param typesPortataEnum
     * @param stagione
     */
    public PrimiPiatti(String nome, Double prezzo, String ingredienti, TypesPortataEnum typesPortataEnum, StagioniEnum stagione) {
        super(nome, prezzo, ingredienti,typesPortataEnum);
        this.stagione = stagione;
    }

    public StagioniEnum getStagione() {
        return stagione;
    }

    /**
     * Metodo per verificare la disponibilità stagionale di una portata
     */
    public void printdisponibilitàStagionale() {

        switch (stagione) {

            case ESTATE ->
                    System.out.println(ColorsEnum.WHITE_CAPITAL.getFormat() + getNome() + ": contiene solo ingredienti freschi");
            case PRIMAVERA ->
                    System.out.println(ColorsEnum.WHITE_CAPITAL.getFormat() + getNome() + ": gli insaccati sono stagionati da almeno 3 mesi");
            case AUTUNNO ->
                    System.out.println(ColorsEnum.WHITE_CAPITAL.getFormat() + getNome() + ": alcuni formati di pasta a seconda della disponibilità potranno essere surgelati");
            case INVERNO ->
                    System.out.println(ColorsEnum.WHITE_CAPITAL.getFormat() + getNome() + ": verdure e alcuni formati di pasta a seconda della disponibilità potranno essere surgelati ");
            default ->
                    System.out.println(ColorsEnum.WHITE_CAPITAL.getFormat() + getNome() + ": il piatto è fuori menù");
        }
    }

    /**
     * Stampa info portata più field specifico della sottoclasse
     *
     * @param coloreIngredienti
     * @param colorePiatti
     */
    @Override
    public void printInfo(ColorsEnum coloreIngredienti, ColorsEnum colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        printdisponibilitàStagionale();

    }
}




