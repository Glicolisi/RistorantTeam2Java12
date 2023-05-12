package portate;

import enumartion.ColorsEnum;
import enumartion.TypesPortataEnum;

public class Bevande extends Portata {
    public boolean isAlcholic;

    /**
     * @param nome
     * @param prezzo
     * @param ingredienti
     * @param typesPortataEnum
     * @param isAlcholic
     */

    public Bevande(String nome, Double prezzo, String ingredienti, TypesPortataEnum typesPortataEnum, boolean isAlcholic) {
        super(nome, prezzo, ingredienti,typesPortataEnum);
        this.isAlcholic = isAlcholic;
    }

    /**
     * Metodo per verificare se una bevanda è alcolica
     *
     * @return booleano
     */
    public boolean isAlcholic() {
        return isAlcholic;
    }

    public void setAlcholic(boolean alcholic) {
        isAlcholic = alcholic;
    }

    /**
     * Metodo per stampare un messaggio se la bevanda è alcolica oppure no
     */
    public void checkAlchol() {
        if (isAlcholic) {
            System.out.print("This item contains alchol");
        } else {
            System.out.println("This item does not contain alchol");
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
        this.isAlcholic();

    }
}






