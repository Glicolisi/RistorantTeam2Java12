import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class SecondiPiatti extends Portate {
    public SecondiPiatti(String nome, Double prezzo, String ingredienti) {
        super(nome, prezzo, ingredienti);
    }
    public static void contieneAllergeni(SecondiPiatti secondoPiatto){
        String [] ingredientiToArray = secondoPiatto.getIngredienti().split(",");
        System.out.println(Utility.RED_UNDERLINED.getFormat()+"La portata "+secondoPiatto.getNome());

        for (Allergeni allergeni1 : Allergeni.values()){
            for (String ingredienti : ingredientiToArray){
                if (allergeni1.getAllergeni().equalsIgnoreCase(ingredienti)){
                    System.out.println("contiene l'allergene: "+allergeni1.getAllergeni());
                }
            }
        }
        System.out.println("\n");
}
}

