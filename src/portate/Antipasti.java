package portate;

import enumartion.ColorsEnum;
import enumartion.TypesPortataEnum;

public class Antipasti extends Portata {

    private boolean isKmZero;

    /**
     *
     * @param nome
     * @param prezzo
     * @param ingredienti
     * @param typesPortataEnum
     * @param isKmZero
     */

    public Antipasti(String nome, Double prezzo, String ingredienti, TypesPortataEnum typesPortataEnum, boolean isKmZero) {
        super(nome, prezzo, ingredienti,typesPortataEnum);
        this.isKmZero = isKmZero;
    }

    public boolean isKmZero() {
        return isKmZero;
    }

    public void setKmZero(boolean kmZero) {
        isKmZero = kmZero;
    }

    /**
     * verifica se la portata contiene prodotti a km zero
     */
    public void provenienzeKmZero() {
        if (isKmZero) {
            System.out.println("Provenienza regionale");
        } else {
            System.out.println("Prodotto fuori regione o surgelato");
        }
    }

    /**
     * Stampa info portata più field aggiuntivo della sottoclasse
     *
     * @param coloreIngredienti
     * @param colorePiatti
     */
    @Override
    public void printInfo(ColorsEnum coloreIngredienti, ColorsEnum colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        this.provenienzeKmZero();
    }

}