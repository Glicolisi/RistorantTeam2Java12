import java.util.HashMap;
import java.util.Map;

public class Dolci {
    private String nomeDolci;
    private double prezzoDolce;
    public static Map<String, Double> dolci = new HashMap<>();

    public Dolci(String nomeDolci, double prezzoDolci) {
        this.nomeDolci = nomeDolci;
        this.prezzoDolce = prezzoDolci;
        dolci.put(nomeDolci, prezzoDolci);
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

    public static void printDolci() {
        System.out.println("Dolci :" + "\n");

        for (Map.Entry<String, Double> secondi : dolci.entrySet()) {
            System.out.println(secondi.getKey() + " = " + secondi.getValue() + " Euro");
        }
    }
}

