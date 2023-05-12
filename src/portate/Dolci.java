package portate;

import enumartion.ColorsEnum;
import enumartion.TypesPortataEnum;

public class Dolci extends Portata {

    private boolean lattosio;

    /**
     *
     * @param nome
     * @param prezzo
     * @param ingredienti
     * @param typesPortataEnum
     * @param lattosio
     */
    public Dolci(String nome, Double prezzo, String ingredienti, TypesPortataEnum typesPortataEnum, boolean lattosio) {
        super(nome, prezzo, ingredienti,typesPortataEnum);
        this.lattosio=lattosio;
    }

    /**
     *
     * @return se contiene lattioso
     */
    public boolean isLattosio() {
        return lattosio;
    }

    public void setLattosio(boolean lattosio) {
        this.lattosio = lattosio;
    }

    /**
     *
     */

    public void conLattosio(){
        if (lattosio){
            System.out.println("Con lattosio");
        }else {
            System.out.println("Senza lattosio");
        }
    }

    /**
     *
     * Metodo che stampa le informazioni della portata
     * @param coloreIngredienti
     * @param colorePiatti
     *
     */
    @Override
    public void printInfo(ColorsEnum coloreIngredienti, ColorsEnum colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
      this.conLattosio();

    }

}

