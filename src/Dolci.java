public class Dolci extends Portata {

    //TODO i nomi facciamo parlanti, poi il metodo di stampa deve stampare tutti i field aggiuntivi
    private String latte;
    public Dolci(String nome, Double prezzo, String ingredienti,String latte) {
        super(nome, prezzo, ingredienti);
        this.latte=latte;
    }
    public String lattosio(){return latte;}
    @Override
    public void printInfo(String coloreIngredienti, String colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
      //  this.latte.toString();

        System.out.print("\n");
    }

}

