
package Models;
import java.util.*;

public class PrimiPiatti {


    private String nomePrimo;
    private Double prezzoPrimo;
    private static Map<String,Double> primiPiatti = new HashMap<>();

    public PrimiPiatti(String nomePrimo, Double prezzoPrimo) {
        this.nomePrimo = nomePrimo;
        this.prezzoPrimo = prezzoPrimo;
        primiPiatti.put(nomePrimo,prezzoPrimo);
    }

    public PrimiPiatti() {
    }

    public String getNomePrimo() {
        return nomePrimo;
    }

    public void setNomePrimo(String nomePrimo) {
        this.nomePrimo = nomePrimo;
    }

    public Double getPrezzoPrimo() {
        return prezzoPrimo;
    }

    public void setPrezzoPrimo(Double prezzoPrimo) {
        this.prezzoPrimo = prezzoPrimo;
    }

    public static Map<String, Double> getPrimiPiatti() {
        return primiPiatti;
    }

    public void setPrimiPiatti(Map<String, Double> primiPiatti) {
        this.primiPiatti = primiPiatti;
    }

    public static void print_Menu(){

        System.out.println(" Primi Piatti :");

        for(Map.Entry<String,Double> primi : getPrimiPiatti().entrySet()){


            System.out.println(primi.getKey()+" = "+primi.getValue()+" Euro");


        }

    }
}
