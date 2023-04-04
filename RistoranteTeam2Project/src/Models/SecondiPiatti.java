//package RistoranteTeam2Project.src.Models;
package Models;

import java.util.HashMap;
import java.util.Map;

public class SecondiPiatti {
    private String nomeSecondo;
    private double prezzoSecondo;
   public static Map<String,Double> secondiPiatti = new HashMap<>();

    public SecondiPiatti(String nomeSecondo, double prezzoSecondo) {
        this.nomeSecondo = nomeSecondo;
        this.prezzoSecondo = prezzoSecondo;
        secondiPiatti.put(nomeSecondo,prezzoSecondo);
    }

    public String getNomeSecondo() {
        return nomeSecondo;
    }

    public void setNomeSecondo(String nomeSecondo) {
        this.nomeSecondo = nomeSecondo;
    }

    public double getPrezzoSecondo() {
        return prezzoSecondo;
    }

    public void setPrezzoSecondo(double prezzoSecondo) {
        this.prezzoSecondo = prezzoSecondo;
    }


    }
