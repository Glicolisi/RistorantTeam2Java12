package portate;

import enumartion.AllergeniEnum;
import enumartion.ColorsEnum;
import enumartion.TypesPortataEnum;

public class SecondiPiatti extends Portata {
    boolean hasFrozenProduct;

    /**
     * @param nome
     * @param prezzo
     * @param ingredienti
     * @param typesPortataEnum
     * @param hasFrozenProduct
     */


    public SecondiPiatti(String nome, Double prezzo, String ingredienti, TypesPortataEnum typesPortataEnum, boolean hasFrozenProduct) {
        super(nome, prezzo, ingredienti,typesPortataEnum);
        this.hasFrozenProduct = hasFrozenProduct;
    }

    public boolean isHasFrozenProduct() {
        return hasFrozenProduct;
    }

    public void setHasFrozenProduct(boolean hasFrozenProduct) {
        this.hasFrozenProduct = hasFrozenProduct;
    }

    /**
     * Verifica se la portata contiene allergeni
     */
    public void contieneAllergeni() {
        String[] ingredientiToArray = this.getIngredienti().split(",");

        System.out.println(ColorsEnum.RED_UNDERLINED.getFormat() + "# La portata " + this.getNome());
        for (AllergeniEnum allergeni : AllergeniEnum.values()) {
            for (String ingredienti : ingredientiToArray) {
                if (allergeni.getAllergeni().equalsIgnoreCase(ingredienti)) {
                    System.out.println("contiene l'allergene: " + allergeni.getAllergeni());
                }
            }
        }
        System.out.println(ColorsEnum.ANSI_RESET.getFormat() + "");
        System.out.println("\n");

    }

    /**
     * Stampa info portata con field aggiuntivo della sottoclasse
     *
     * @param coloreIngredienti
     * @param colorePiatti
     */
    @Override
    public void printInfo(ColorsEnum coloreIngredienti, ColorsEnum colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        System.out.println("** contiene prodotti surgelati: " + this.hasFrozenProduct);

    }

}


