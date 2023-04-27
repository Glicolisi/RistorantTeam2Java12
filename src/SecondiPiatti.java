import Enums.AllergeniEnum;
import Enums.UtilityEnum;

public class SecondiPiatti extends Portata {
    boolean hasFrozenProduct;
    
    
    //TODO field come le altre classi
    public SecondiPiatti(String nome, Double prezzo, String ingredienti,boolean hasFrozenProduct) {
        super(nome, prezzo, ingredienti);
        this.hasFrozenProduct=hasFrozenProduct;
    }

    public boolean isHasFrozenProduct() {
        return hasFrozenProduct;
    }

    public void setHasFrozenProduct(boolean hasFrozenProduct) {
        this.hasFrozenProduct = hasFrozenProduct;
    }

    public void contieneAllergeni(){
        String [] ingredientiToArray = this.getIngredienti().split(",");
        System.out.println(UtilityEnum.RED_UNDERLINED.getFormat()+"# La portata "+this.getNome());

        for (AllergeniEnum allergeni : AllergeniEnum.values()){
            for (String ingredienti : ingredientiToArray){
                if (allergeni.getAllergeni().equalsIgnoreCase(ingredienti)){
                    System.out.println("contiene l'allergene: "+allergeni.getAllergeni());
                }
            }
        }
        System.out.println(UtilityEnum.ANSI_RESET.getFormat()+"");
        System.out.println("\n");

}

    @Override
    public void printInfo(String coloreIngredienti, String colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        System.out.println("** contiene prodotti surgelati: "+ this.hasFrozenProduct);

    }

}


