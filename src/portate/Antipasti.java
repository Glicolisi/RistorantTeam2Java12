package portate;

import enumartion.UtilityEnum;

public class Antipasti extends Portata {

    private boolean isKmZero;

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

    public void provenienzeKmZero(){
        if (isKmZero){
            System.out.println("Provenienza regionale");
        }else {
            System.out.println("Prodotto fuori regione o surgelato");
        }
    }

    @Override
    public void printInfo(UtilityEnum coloreIngredienti, UtilityEnum colorePiatti) {
        super.printInfo(coloreIngredienti, colorePiatti);
        this.provenienzeKmZero();
    }

    //TODO eliminare

//        public void printAntipasti() {
//
//        System.out.println(Utility.BLUE_UNDERLINED.getFormat() + "portate.Antipasti: " + Utility.BLUE.getFormat());
//        for (portate.Portata antipasti : portataList) {
//            antipasti.printInfo(Utility.BLUE.getFormat(), Utility.BLUE_CAPITAL.getFormat());
//            antipasti.provenienzeKmZero(antipasti.isKmZero());
//        }
//        System.out.print("\n");
//    }

}