public class Bevande extends Portata {
    public boolean isAlcholic;

    public Bevande(String nome, Double prezzo, String ingredienti, boolean isAlcholic) {
        super(nome, prezzo, ingredienti);
        this.isAlcholic = isAlcholic;
    }

    public boolean isAlcholic() {
        return isAlcholic;
    }

    public void setAlcholic(boolean alcholic) {
        isAlcholic = alcholic;
    }

    public void checkAlchol() {
        if (isAlcholic == true) {
            System.out.print("This item contains alchol");
        } else {
            System.out.println("This item does not contain alchol");
        }
    }


    @Override
    public void printInfo(String coloreIngredienti, String colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        this.isAlcholic();
//        System.out.print("\n");
    }
}






