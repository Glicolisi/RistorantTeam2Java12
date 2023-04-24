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

    public void printInfo(String coloreIngredienti,String colorePiatti){
        System.out.println(nome+": "+prezzo+" euro");
        System.out.println(colorePiatti+"("+ingredienti+")"+coloreIngredienti);

    }

    public void printMenu(Menu menu){
        for (Portata p: menu.getPortataList()){
            if (p instanceof Antipasti){
                System.out.println("Antipasti: " + "\n");
                System.out.println(p);
            }else if (p instanceof PrimiPiatti){
                System.out.println("PrimiPiatti: ");
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        return "Portata{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", ingredienti='" + ingredienti + '\'' +
                '}';
    }
    //    public void printAntipasti() {
//
//        System.out.println(Utility.BLUE_UNDERLINED.getFormat() + "Antipasti: " + Utility.BLUE.getFormat());
//        for (Portata antipasti : portataList) {
//            antipasti.printInfo(Utility.BLUE.getFormat(), Utility.BLUE_CAPITAL.getFormat());
//            antipasti.provenienzeKmZero(antipasti.isKmZero());
//        }
//        System.out.print("\n");
//    }
}
