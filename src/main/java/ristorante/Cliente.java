package ristorante;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Cliente {
    private String name;
    private String surname;
    private Integer numeroPersone;
    private boolean hasGotFideltyCard;
    private long fideltyCardNumber;

    public Cliente(String name, String surname, Integer numeroPersone) {
        this.name = name;
        this.surname = surname;
        this.numeroPersone = numeroPersone;
        this.hasGotFideltyCard = hasGotFideltyCard;
        this.fideltyCardNumber = 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    public long getFideltyCardNumber() {
        return fideltyCardNumber;
    }

    /**
     * Metodo che assegna al cliente una carta fedeltà ad 8 cifre
     */

    public void assignFideltyNumberCard() {
        Random rd = new Random();
        if (!this.hasGotFideltyCard) {
            this.fideltyCardNumber = rd.nextLong(99999999);
            hasGotFideltyCard = true;
        }
        if (this.hasGotFideltyCard) {
            System.out.println("La fidelty card di questo cliente è la numero " + fideltyCardNumber);
        }
        //Mettiamo un massimo di 8 cifre e lo facciamo essere sempre positivo
        if (fideltyCardNumber < 0) {
            fideltyCardNumber = fideltyCardNumber * -1;
        }
    }
}
