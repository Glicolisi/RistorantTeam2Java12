package RistorantTeam2Java12.RistoranteTeam2Project.src.Models;

import java.util.HashMap;
import java.util.Map;

public class Antipasti {
    // TODO: 03/04/2023 creare una mappa che prendera nome piatto come key e prezzo come value. aggiungere alla mappa i nomi e i prezzi
    private static String nomeAntipasti;
    private static double prezzoAntipasti;

    private static Map<String, Double> antipasti = new HashMap<>();

    public Antipasti(String nomeAntipasti, double prezzoAntipasti) {
        this.nomeAntipasti = nomeAntipasti;
        this.prezzoAntipasti = prezzoAntipasti;
        antipasti.put(nomeAntipasti,prezzoAntipasti);
    }

    public Antipasti() {
    }

    public String getNomeAntipasti() {//
        return nomeAntipasti;
    }

    public void setNomeAntipasti(String nomeAntipasti) {//
        Antipasti.nomeAntipasti = nomeAntipasti;
    }

    public double getPrezzoAntipasti() {//
        return prezzoAntipasti;
    }

    public void setPrezzoAntipasti(double prezzoAntipasti) {//
        Antipasti.prezzoAntipasti = prezzoAntipasti;
    }

    public static Map<String, Double> getAntipasti() {
        return antipasti;
    }

    public static void setAntipasti(Map<String, Double> antipasti) {
        Antipasti.antipasti = antipasti;
    }

    public static void printMenuAntipasti(){
        System.out.println("ANTIPASTI"+ "\n");

        for (Map.Entry<String, Double> antipasti : getAntipasti().entrySet()){
            System.out.println(antipasti.getKey() + " " + antipasti.getValue() + " Euro");
        }
    }
}
