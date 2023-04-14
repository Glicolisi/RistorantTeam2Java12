public class Antipasti {

    private  String nome;

    private  double prezzo;

    public Antipasti(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {//
        return nome;
    }

    public void setNome(String nome) {//
        this.nome = nome;
    }

    public double getPrezzoAntipasti() {//
        return prezzo;
    }

    public  void printMenuAntipasti(){
        System.out.println(UtilityColor.BLUE+ "\n"+ nome + " " + prezzo);

//        UtilityColor.BLUE + "Antipasti :" +
    }
}
