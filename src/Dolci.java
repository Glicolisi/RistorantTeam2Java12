public class Dolci extends Portata {

    //TODO i nomi facciamo parlanti, poi il metodo di stampa deve stampare tutti i field aggiuntivi
    private boolean lattosio;
    public Dolci(String nome, Double prezzo, String ingredienti,boolean lattosio) {
        super(nome, prezzo, ingredienti);
        this.lattosio=lattosio;
    }

    public boolean isLattosio() {
        return lattosio;
    }

    public void setLattosio(boolean lattosio) {
        this.lattosio = lattosio;
    }

    public void conLattosio(){
        if (lattosio){
            System.out.println("Con lattosio");
        }else {
            System.out.println("Senza lattosio");
        }
    }
    @Override
    public void printInfo(String coloreIngredienti, String colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
      this.conLattosio();

//        System.out.print("\n");
    }

}

