package ristorante;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Cliente {
    private String name;
    private String surname;
    private boolean hasGotFideltyCard;
    private long fideltyCardNumber;

    public Cliente(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.hasGotFideltyCard = hasGotFideltyCard;
        this.fideltyCardNumber = 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getFideltyCardNumber() {
        return fideltyCardNumber;
    }

    /**
     * Metodo che assegna al cliente una carta fedeltà ad 8 cifre
     * @param cliente
     */
    public void assignFideltyNumberCard(Cliente cliente) {
        Random rd = new Random();
        if (!cliente.hasGotFideltyCard) {
            this.fideltyCardNumber = rd.nextLong(99999999);
            hasGotFideltyCard = true;
        }
        if (cliente.hasGotFideltyCard) {
            System.out.println("La fidelty card di questo cliente è la numero " + fideltyCardNumber);
        }
        //Mettiamo un massimo di 8 cifre e lo facciamo essere sempre positivo
        if (fideltyCardNumber < 0) {
            fideltyCardNumber = fideltyCardNumber * -1;
        }
    }

    /**
     * Metodo che cerca un cliente per nome e cognome
     * @param clientList
     * @param name
     * @param surname
     */
    public void findClientByNameAndSurname(ArrayList<Cliente> clientList,String name,String surname) {
        for (Cliente cliente : clientList) {
            String clientNameTrim = cliente.getName().trim().toLowerCase();
            String clientSurnameTrim = cliente.getSurname().trim().toLowerCase();
            if (clientNameTrim.equals(cliente.getName()) && clientSurnameTrim.equals(cliente.getSurname())) {
                System.out.println("Il cliente che stai cercando è " + cliente.getName() +
                        " " + cliente.getSurname() + " e il numero della sua fidelty card è " + fideltyCardNumber);
            } else {
                System.out.println("Ci dispiace ma non esiste nessun cliente dal nome " + name + " " + surname);
            }
        }
    }
}
