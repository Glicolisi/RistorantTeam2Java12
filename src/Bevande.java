import java.util.HashMap;
import java.util.Map;

public class Bevande {
    private String nome;
    private Double prezzo;

    public Bevande(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
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

    public void printMenuBevande() {
        System.out.println(UtilityColor.PURPLE + UtilityColor.PURPLE + nome + " " + prezzo + " euro");
    }
}






