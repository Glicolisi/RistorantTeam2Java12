package Models;

import java.util.HashMap;
import java.util.Map;

public class Bevande {


    private String nomeBevanda;
    private Double prezzoBevanda;
    private static Map<String, Double> bevande = new HashMap<>();

    public Bevande(String nomeBevanda, Double prezzoBevanda) {
        this.nomeBevanda = nomeBevanda;
        this.prezzoBevanda = prezzoBevanda;
        bevande.put(nomeBevanda, prezzoBevanda);
    }

    public String getNomeBevanda() {
        return nomeBevanda;
    }

    public Double getPrezzoBevanda() {
        return prezzoBevanda;
    }

    public static Map<String, Double> getBevande() {
        return bevande;
    }

    public void setNomeBevanda(String nomeBevanda) {
        this.nomeBevanda = nomeBevanda;
    }

    public void setPrezzoPrimo(Double prezzoBevanda) {
        this.prezzoBevanda = prezzoBevanda;
    }

    public static void setBevande(Map<String, Double> bevande) {
        Bevande.bevande = bevande;
    }

    public static void printBevande() {

        System.out.println("Bevande:");

        for (Map.Entry<String, Double> bevande : getBevande().entrySet()) {


            System.out.println(bevande.getKey() + " = " + bevande.getValue() + " Euro");
            if (bevande.getKey() == "Vino") {
                System.out.println("Chiedere al cameriere la carta dei vini");
            }

        }

    }
}



