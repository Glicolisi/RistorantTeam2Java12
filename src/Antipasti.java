public class Antipasti extends Portate {

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

    public void provenienzeKmZero(boolean isKmZero){
        if (isKmZero){
            System.out.println("Provenienza regionale");
        }else {
            System.out.println("Prodotto fuori regione o surgelato");
        }
    }

}