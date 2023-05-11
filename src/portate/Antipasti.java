package portate;

import enumartion.UtilityEnum;

public class Antipasti extends Portata {

    private boolean isKmZero;

    /**
     * @param nome
     * @param prezzo
     * @param ingredienti
     * @param isKmZero
     */

    public Antipasti(String nome, Double prezzo, String ingredienti, boolean isKmZero) {
        super(nome, prezzo, ingredienti);
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
    public void printInfo(UtilityEnum coloreIngredienti, UtilityEnum colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        this.provenienzeKmZero();
    }

}