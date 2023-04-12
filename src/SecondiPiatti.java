import java.util.HashMap;
import java.util.Map;

public class SecondiPiatti {
    private String nome;
    private double prezzo;


    public SecondiPiatti(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void printMenuSecondi(){

        System.out.println(UtilityColor.CYAN_BOLD +nome +" "+" "+prezzo+" euro" );

    }

}

