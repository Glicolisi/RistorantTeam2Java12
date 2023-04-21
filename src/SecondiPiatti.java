public class SecondiPiatti extends Portata {
    
    
    //TODO field come le altre classi
    public SecondiPiatti(String nome, Double prezzo, String ingredienti) {
        super(nome, prezzo, ingredienti);
    }
    public void contieneAllergeni(){
        String [] ingredientiToArray = this.getIngredienti().split(",");
        System.out.println(Utility.RED_UNDERLINED.getFormat()+"La portata "+this.getNome());

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

