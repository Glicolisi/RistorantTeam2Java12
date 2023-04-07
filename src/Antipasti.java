import java.util.Map;

public class Antipasti {

    private  String nome;

    //TODO non mettere mai il nome delle classe dopo
    private  double prezzoAntipasti;

    //TODO attenzione ai nomi e sistemiamo il tutto
    public Antipasti(String nome, double prezzoAntipasti) {
        this.nome = nome;
        this.prezzoAntipasti = prezzoAntipasti;
    }

    public String getNome() {//
        return nome;
    }

    public void setNome(String nome) {//
        this.nome = nome;
    }

    public double getPrezzoAntipasti() {//
        return prezzoAntipasti;
    }

    public  void printMenuAntipasti(){
        System.out.println(UtilityColor.ANSI_BLUE_BACKGROUND + "Antipasti :"+UtilityColor.ANSI_BLUE_BACKGROUND+ "\n"+ nome + prezzoAntipasti);

    }
}
