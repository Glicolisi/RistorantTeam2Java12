package portate;


public class Portata {
    private String nome;
    private Double prezzo;
    private String ingredienti;

    public Portata(String nome, Double prezzo, String ingredienti) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    //TODO passiamo sempre l'enumerato e poi usiamo
    public void printInfo(String coloreIngredienti,String colorePiatti){
        System.out.println(colorePiatti+nome+": "+prezzo+" euro");
        System.out.println(coloreIngredienti+"("+ingredienti+")");

    }

    //TODO rivedere
    public void printInfo(){
        System.out.println(nome+": "+prezzo+" euro");
        System.out.println("("+ingredienti+")");

    }



    @Override
    public String toString() {
        return "portate.Portata{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", ingredienti='" + ingredienti + '\'' +
                '}';
    }
    //    public void printAntipasti() {
//
//        System.out.println(Utility.BLUE_UNDERLINED.getFormat() + "portate.Antipasti: " + Utility.BLUE.getFormat());
//        for (portate.Portata antipasti : portataList) {
//            antipasti.printInfo(Utility.BLUE.getFormat(), Utility.BLUE_CAPITAL.getFormat());
//            antipasti.provenienzeKmZero(antipasti.isKmZero());
//        }
//        System.out.print("\n");
//    }
}
