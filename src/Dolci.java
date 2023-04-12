import java.util.HashMap;
import java.util.Map;

public class Dolci {
    private String nomeDolci;
    private double prezzoDolce;
    public static Map<String, Double> dolci = new HashMap<>();

    public Dolci(String nomeDolci, double prezzoDolci) {
        this.nomeDolci = nomeDolci;
        this.prezzoDolce = prezzoDolci;

    }

    public String getNomeDolci() {
        return nomeDolci;
    }

    public void setNomeDolci(String nomeSecondo) {
        this.nomeDolci = nomeSecondo;
    }

    public double getPrezzoDolce() {
        return prezzoDolce;
    }

    public void setPrezzoDolce(double prezzoDolce) {
        this.prezzoDolce = prezzoDolce;
    }

    public  void printMenuDolci(){

        System.out.println(  "Dolce :"+ nomeDolci +"-"+ prezzoDolce+"€");

    }
}

